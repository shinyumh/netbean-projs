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
public class array1 {
    public static void main(String [] args)
    {
        //int a1[20];	//invalid

        int [] a1;	//a1 is a ref only; no array object allocated
        //a1[0] = 2; //still invalid
        //System.out.println("a1.length = " + a1.length);

        a1 = new int[10];	//now an array object is allocated
        System.out.println("a1.length = " + a1.length);
        a1[0] = 2;	//this is valid now
        printArray(a1);

        //or
        int a2[] = new int[10];	//array object is allocated
        a2[0] = 2;
        System.out.println("a2[1] = " + a2[1]);

        //int x;	//not initialized yet
        //System.out.println("uninitialized x = " + x);
        int x = 2;
        System.out.println("initialized x = "+ x + "\n");
        //printArray(x);	//wrong
        for (int index = 0; index < a1.length; index++)
            a1[index] = index * 2;
        printArray(a1);
    }

    static void printArray(int a[])
    {
        for (int index = 0; index < a.length; index++)
            System.out.println("printArray["+ index
                + "] = " + a[index]);
        System.out.println("address of a = " + a);
    }        
}
