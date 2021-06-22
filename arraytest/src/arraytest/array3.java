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
public class array3 {
    public static void main (String [] args)
    {
        int a1 [] = {10, 20} ;	//allowed
        System.out.println("a1.length=" + a1.length );

        int a2 [] = new int[10];
        int a3 [] = {a2.length, a2.length } ;
        System.out.println("a3= " + a3[0] + ", " + a3[1] );

        char a4 [];
        char [] a5;

        //all a6, a7, a8, & a9 are 3D
        byte    [][][]a6;
        byte    [][]a7[];
        byte    []a8[][];
        byte a9 [][][];
    }
}
