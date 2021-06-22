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
public class array2 {
    public static void main(String [] args)
    {
        int a1[];
        Integer b1[];
        complex c1[];
        //same as
        int [] a2;
        Integer [] b2;
        complex [] c2;

        //*********

        int [][] a3 = new int[10][20];
        Integer [][] b3;
        complex [][] c3;
        //same as
        int a4[][];
        Integer b4[][];
        complex c4[][];
        //same as
        int [] a5 [];
        Integer [] b5 [];
        complex [] c5 [];

        //*********

        int [] b6[], b7, b8[][];
        //b6 is [][] 2D, b7 is [] 1D, b8 is [][][] 3D

        int [][] b9, b10[], b11;
        //b9 is 2D, b10 is 3D, b11 is 2D


        //array creation expression
        int x1[] = new int[] {1, 2, 3, 4};
        //array initializer
        int x2[] = {1, 2, 3, 4};	//valid only at declaration time

        //array assignment statement
        x1 = new int[] {5, 6, 7};
        //x2 = {5, 6, 7}; //invalid to use the intializer here
    }
}
