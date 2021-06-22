/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

/**
 *
 * @author melodyhu
 */
public class except4 {
    public static void main4(String[] args)
    {
        try
        {
            System.out.print("Your mind ");
            foo();
            System.out.print("to ");
        }
        catch(ArithmeticException e)
        {
            System.out.print("the wind ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Mission College ");
        }
        finally
        {
            System.out.print("look ");
        }
        System.out.println("for it! ");
    }
    
    public static void foo()
    {
        int a[]={1, 2, 3, 4}, i = 1, j = 0, k;
        try 
        {
            i = a[4];
            k = i/j;
            System.out.print("happy ");
        }
        catch(ArrayIndexOutOfBoundsException e) 
        //catches out of bounds index
        {
            System.out.print("is gone ");
        }
        catch(ArithmeticException e) //catches div by 0
        {
            System.out.print("in love ");
        }
        finally
        {
            System.out.print("with java; ");
        }
        System.out.print("make sure ");
    }
}
