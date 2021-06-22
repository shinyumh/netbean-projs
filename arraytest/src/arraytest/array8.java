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
public class array8 {
    public static void main (String [] args)
    {
        int len = 5;
        complex A1[] = new complex[]
        {
            new complex(1, 1), new complex(2, 2),
            new complex(3, 3), new complex(4, 4),
            new complex(5, 5)
        };

        complex A2[] = new complex[len];

        A2 = A1;//reference copy of A1 ref to A2 ref

        A1[1] = new complex(10, 10);	//change [1] in A1 only
        if (A2[1] == A1[1])
            System.out.println("Case1: It made a reference copy of A1 only, " +
            " A1 & A2 point to same Object" );
        else
            System.out.println("Case1: Deep copy of A1 references" );

        A2 = new complex[len];
        System.arraycopy(A1, 0, A2, 0, A1.length);

        //now change A1[1]
        A1[1].set(20, 20);
        if (A2[1].equals(A1[1]))
            System.out.println("Case2: Again, reference copy only, " +
            " A1 & A2 point to same Object" );
        else
            System.out.println("Case2: Deep copy using arraycopy" );

        A2 = (complex []) A1.clone();

        //now change A1[1]
        A1[1].set(30, 30);
        if (A2[1].equals(A1[1]))
        {
            System.out.println("Case3: Again, reference copy only, " +
            " A1 & A2 point to same Object" );
        }
        else
        {
            System.out.println("case3: This is a deep copy; not just references");
            System.out.println("A1 & A2 point to different Objects" );
        }

        copyArray(A1, A2);//my deep copy method

        //now change A1[1]
        A1[1].set(40, 40);
        if (A2[1].equals(A1[1]))
        {
            System.out.println("Case4: Again, reference copy only, " +
            " A1 & A2 point to same Object" );
        }
        else
        {
            System.out.println("case4: This is a deep copy; not just references");
            System.out.println("A1 & A2 point to different Objects" );
        }
    }

    public static boolean copyArray(
            complex [] src, complex [] dst)
    {
        if (src.length != dst.length)
            return false;

        for (int index = 0; index < src.length; index++)
        {
            dst[index] = (complex) src[index].clone();
        }
        return true;
    }    
}
