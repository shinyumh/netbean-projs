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
public class array4 {
    public static void main (String [] args)
    {
        int a [] = {'a'} ;//97; ascii of 'a'
        System.out.println("a[0] = " + a[0]);
            //prints 97; ASCII of 'a'
        int [] b = { a.length, 2, 3 } ;
        char c [][] = new char[12][31];
        char[] d [] = { {1,1,1,1}, {2,2,2,2} }; // creates d[2][4]
        char[][] e  = { {1,1,1,1}, {2,2,2,2} }; // creates e[2][4]

        byte f [][][] = new byte [3][3][7];
        byte [][] g[] = new byte [3][3][7];

        System.out.println("a.length=" + a.length );
        b = method2();//20 now

        b[19] = 0;
        System.out.println("b.length=" + b.length );

        try
        {
            b[20] = 0;   // causes a runtime exception
        }
        catch(Exception error)
        //catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println(error);
        }

        System.out.println("See you later :) ");
    }

    //static  int method1 () [][]
    static  int [][] method1 () //[][]
    {
        return new int[5][2];
    }

    static  int [] method2 ()
    {
        return new int[20];
    }

    static  int [] method3 () []
    {
        return new int[20][3];
    }
}
