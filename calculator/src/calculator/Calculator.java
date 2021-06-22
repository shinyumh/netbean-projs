/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author melodyhu
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex c0 = new Complex();
        Complex c1 = new Complex (3, 4);
        Complex c2 = new Complex (6, 8);
        Complex c3 = (Complex) c2.clone(); //casting to Complex
        Complex c;
        
        System.out.println("c0 = " + c0);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        
        c = c1.add(c2);
        System.out.println("c = c1 + c2 = " + c);
        c = c1.sub(c2);
        System.out.println("c = c1 - c2 = " + c);
        c = c1.mul(c2);
        System.out.println("c = c1 * c2 = " + c);
        c = c1.div(c2);
        System.out.println("c = c1 / c2 = " + c);        
        /*int comp = 0;
        comp = c1.compareto(c2);
        System.out.println("c1 compare to c2: " + comp)
        comp = c2.compareto(c1);
        System.out.println("c2 compare to c1: " + comp)*/
    }
    
}
