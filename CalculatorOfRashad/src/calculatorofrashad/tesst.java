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
public class tesst {
     int index;
    int count;
    String postfix[];
    String infix;
    stackk stack;
    public tesst(String infix,int count) {
        index=0;
        stack=new stackk(100);
        this.count=count;
        postfix=new String[count];
        this.infix=infix;
    }
    public String[] conToPos()
    {
      int i;
       // String infix="1 + 23 + 2";
     String [] ar=infix.split(" ");
       for(int j=0;j<ar.length;j++)
       {
           System.out.print(ar[j]);
       }
        for( i=0;i<ar.length;i++)
        { 
        //    String s=ar[i];
            if(ar[i].equals("*")==false&&ar[i].equals("/")==false&&ar[i].equals("%")==false&&ar[i].equals("-")==false&&ar[i].equals("+")==false&&ar[i].equals("(")==false&&ar[i].equals(")")==false)
            {postfix[index++]=ar[i];
            System.out.println("postfix at index="+index+ " "+  postfix[index-1]+" "+ "number");}
             else if(ar[i].equals(")")==true)
            {
               
                {while(stack.top().equals("(")==false&& stack.isEmpty()==false)
                     postfix[index++]=stack.pop();
                }
                stack.pop();
                System.out.println("postfix at index="+index+  postfix[index-1]+  "found )");
            }
             else if(stack.isEmpty())
            {stack.push(ar[i]);System.out.println(  "push in empty stack"+stack.top());}
             else
            {
               String x=stack.top();
                while(x.equals("(")==false&&stack.isEmpty()==false&&Prio(stack.top())>=Prio(ar[i]))
                {postfix[index++]=stack.pop();}
                stack.push(ar[i]);
                System.out.println(  "push in stack if it is not empty and may pop be ( "+stack.top());
            }
     
        }
        
             while(stack.isEmpty()==false)
        {postfix[index++]=stack.pop();
        System.out.println("pop all from stack");
        }
        String p[];
         p = new String[index];
         for(int j=0;j<p.length;j++)
         {
             p[j]=postfix[j];
         }

        return p;
    }
     private int Prio(String c)
    {
     
         
             
        if(c.equals("*")||c.equals("/")||c.equals("%"))
            return 1;
        else if(c.equals("("))
            return 2;
        else
            return 0;
       
    }
}
