/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;
import java.util.Arrays;
/**
 *
 * @author melodyhu
 */
public class array10 {
    public static void main(String[] args) {
        // TODO code application logic here
        // sort doubleArray into ascending order
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf("doubleArray: ");

        for (double value : doubleArray)
            System.out.printf("%.1f ", value);
        System.out.println();

        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray into array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
            (b ? "==" : "!="));

        // compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n",
            (b ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0)
            System.out.printf(
            "Found 5 at element %d in intArray%n", location);
        else
            System.out.println("5 not found in intArray");

        // search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 20);

        if (location >= 0)
            System.out.printf(
            "Found 20 at element %d in intArray%n", location);
        else
            System.out.println("20 not found in intArray");

    }

    // output values in each array
    public static void displayArray(int[] array, String description)
    {
        System.out.printf("%n%s: ", description);

        for (int value : array)
            System.out.printf("%d ", value);
        System.out.println();

    }
}
