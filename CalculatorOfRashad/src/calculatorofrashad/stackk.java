/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorofrashad;

/**
 *
 * @author pc
 */
public class stackk {
      private String []starr;
    private int maxsize;
    private int index;

    public stackk(int maxsize) {
        this.maxsize = maxsize;
        index=-1;
        starr=new String[maxsize];
    }
    public void push(String x)
    {
        if(index!=maxsize-1)
        {starr[++index]=x;}
    }
    public String pop()
    {
         if(index!=-1)
         {System.out.println("poped from stack "+starr[index]);
             return starr[index--] ;}
       return null;  
    }
    public String top()
    {
        return starr[index] ;
    }
    public boolean isEmpty()
    {
        if(index==-1)
            return true;
        else
            return false;
    }
    public boolean topy()
    {
        if(starr[index].equals(")"))
            return true;
        return false;
    }
     
     public boolean isFull()
    {
        if(index==maxsize-1)
            return true;
        else
            return false;
    }
}
