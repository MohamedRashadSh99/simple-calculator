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
public class stac {

    private int[] starr;
    private int maxsize;
    private int index;

    public stac(int maxsize) {
        this.maxsize = maxsize;
        index = -1;
        starr = new int[maxsize];
    }

    public void push(int x) {
        if (index != maxsize - 1) {
            starr[++index] = x;
        }
    }

    public int pop() {

        
        return starr[index--];

    }

    public int top() {
        return starr[index];
    }

    public boolean isEmpty() {
        if (index == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (index == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }
}
