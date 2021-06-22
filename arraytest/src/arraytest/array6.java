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
public class array6 {
    public static void main(String [] args)
    {
        int a = 0;
        int b, c, d = 3, i;
        b = c = d;	// a <== c <== d

        System.out.println("b = " + b + ", c = " + c + ", d = " + d);

        int A[] = new int[10];
        A[1] = 1;

        //int B[10]; //<--doesn't work
        //int B[] = new int[10]; // Use this instead.

        b = 3 * 5 % 3;	//same precedence; left to right
        A[method1()] = A[method2()] = 1;

        System.out.println("1: b = " + b);

        a += b -= 5;
        System.out.println("2: b = " + b);
        System.out.println("2: a = " + a);
    }

    static int method1()
    {
        System.out.println("method1");
        return 1;
    }

    static int method2()
    {
        System.out.println("method2");
        return 1;
    }
}
