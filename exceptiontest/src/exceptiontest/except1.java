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
public class except1 {
    public static void main1(String[] args) {
        try{
            int a[] = {1, 2, 3};
            int i = 10, j = 0, k;
            k = a[3];
            System.out.println("0");
        }
        /*catch(ArithmeticException e){
            System.out.println("1 " + e);
        }*/
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("2 " + e);
        }
        catch(Exception e){ //exception has to be the last "catch"; catches everything
            System.out.println("3 " + e);
        }
        finally{
            System.out.println("4 ");
        }
        System.out.println("5 ");
    }
}
