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
public class contextOperations {

    private Strategy strat;

    public contextOperations(Strategy strat) {
        this.strat = strat;
    }
    public int evaluateOp(int p1,int p2)
    {
        return strat.doOperation(p1, p2);
    }

}
