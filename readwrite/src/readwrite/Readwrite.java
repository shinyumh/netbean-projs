/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;
import java.util.Scanner;
/**
 *
 * @author melodyhu
 */
public class Readwrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f = 12;
        int g = 14;
        System.out.println(g%f);
        //2
        System.out.println("welcome to readwrite!");
        Scanner scan1 = new Scanner(System.in);
        
        int i1 = 0, i2 = 0;
        System.out.print("enter i1 > ");
        i1 = scan1.nextInt();
        System.out.print("enter i2 > ");
        i2 = scan1.nextInt();
        
        if (i1 > i2)
            System.out.println("i1: " + i1 + " is larger than i2: " + i2);
        else if (i2 > i1)
            System.out.println("i2: " + i2 + " is larger than i1: " + i1);
        else
            System.out.println("the two numbers are equal");
        
        
        
        //3
        System.out.println("comparing integers");
        Scanner scan2 = new Scanner(System.in);
        
        int num1 = 0, num2 = 0;
        System.out.print("enter the first number: ");
        num1 = scan2.nextInt();
        System.out.print("enter the second number: ");
        num2 = scan2.nextInt();
        
       // if (num1 % num2 = 0)
          //  System.out.println("");
    }
    
}
