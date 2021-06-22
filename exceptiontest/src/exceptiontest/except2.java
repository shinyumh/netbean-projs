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
public class except2 {
    public static void main2(String[] args) {
        for (int i = 0; i<2; i++){
            foo();
        }
    }
    
    public static void foo(){
        int i = 1, j=0, k;
        try{
            k = i/j;
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally called");
        }
        System.out.println("after finally");
    }
}
