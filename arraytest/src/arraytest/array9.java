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
public class array9 {
    public static void main(String[] a)
    {
        //the following three blocks show three different
        //ways to initialize an array of arrays; the second
        //dimension is not the same in all arrays; i.e. dimensions
        //of elemeents 0 through 5 are not the same
        {
            int A1[][] = new int[][]
            {
                {0,1,2,3,4},
                {0,1,2,3},
                {0,1,2},
                {0,1},
                {0}
            };
        }

        {
            int A1[][] = new int[5][];
            A1[0] = new int[] {0,1,2,3,4};
            A1[1] = new int[] {0,1,2,3};
            A1[2] = new int[] {0,1,2};
            A1[3] = new int[] {0,1};
            A1[4] = new int[] {0};
        }

        {
            int A1[][] = new int[5][];

            for( int i=0; i<A1.length; i++)
            {
                int tmp[] = new int [i+1];
                for (int j=0; j<=i; j++)
                        tmp[j]=j;
                A1[i] = tmp;
            }
        }
    }
}
