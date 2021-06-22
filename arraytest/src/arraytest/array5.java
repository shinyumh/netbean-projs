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
public class array5 {
    public static void main(String [] args)
    {
        int a1[] = {1,2,3,4};
        int a2[] = {2};

        System.out.println("Before: a2.length = "+ a2.length);
        System.out.println("Before: a1[2] = "+ a1[2]);
        a2 = a1;  //copy reference; both a1 & a2 refer to {1, 2, 3, 4}
            //it did not copy the array;
        a2[2] = 0; //valid since a2 refers to a1 now
        System.out.println("After: a2.length = "+ a2.length);
        System.out.println("After: a1[2] = "+ a1[2]);

    }
}
