/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;

/**
 *
 * @author melodyhu
 */
public class array7 {
    public static void main (String [] args)
    {
        int a = 0;

        Integer A[] = new Integer[10];
        System.out.println("a = " + a );

        //Compile time error since it returns A[3] before
        //it has been assigned a value
        try
        {
            A[3] = new Integer(7);
            //A[4] = new Integer("-12");
            a = A[3].intValue();
            //a = A[4].intValue();
        }
        catch(Exception error)
        //catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println("Inside catch");
            System.out.println(error);
        }

        System.out.println("a = " + a );
        System.out.println("See you later :) ");
    } 
}
