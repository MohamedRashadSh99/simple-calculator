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
public class evaluatingPostfix {

    String[] postfix;
    contextOperations c;
    

    public evaluatingPostfix(String[] postfix) {
        this.postfix = postfix;
        
      
    }

    private int evaluate(String x, int p1, int p2) {
        
        if (x.equals("+")) {
            c=new contextOperations (new add());
            
       return c.evaluateOp(p1, p2) ;
            
        } else if (x.equals("/")) {
             c=new contextOperations (new division());
         return c.evaluateOp(p1, p2) ;
 
        } else if (x.equals("%")) {
             c=new contextOperations (new mod());
   return c.evaluateOp(p1, p2) ;
        } else if (x.equals("-")) {
             c=new contextOperations (new subtracte());
       return c.evaluateOp(p1, p2) ;
        } else {
             c=new contextOperations (new multibly());
         return c.evaluateOp(p1, p2) ;
        }

    }

   public int evaluating() {
        int result = 0;
         stac s = new stac(100);
        for (int i = 0; i < postfix.length; i++) {
           if(postfix[i].equals("") == false)
           { if (postfix[i].equals("*") == false && postfix[i].equals("/") == false && postfix[i].equals("%") == false && postfix[i].equals("-") == false && postfix[i].equals("+") == false && postfix[i].equals("(") == false && postfix[i].equals(")") == false) {
                int  y1 = Integer.valueOf(postfix[i]);
                s.push(y1);
                System.out.println("push safe" + postfix[i]);
            } else {
                int fi = s.pop();
                int sec = s.pop();
                result = evaluate(postfix[i], fi, sec);
                s.push(result);
                 System.out.println("push result" + result);
            }

        }}
        result = s.pop();
        return result;
    }
}
