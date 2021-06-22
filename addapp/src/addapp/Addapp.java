/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapp;
import javax.swing.JOptionPane;
/**
 *
 * @author melodyhu
 */
public class Addapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1,s2;
        double n1, n2, sum;
        
        s1 = JOptionPane.showInputDialog("SUM CALCULATOR\nenter the first number:");
        s2 = JOptionPane.showInputDialog("SUM CALCULATOR\nenter the second number:");
        
        n1 = Double.parseDouble(s1);
        n2 = Double.parseDouble(s2);
        
        sum = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "sum of " + s1 + " + " + s2 + ": " + sum, "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
