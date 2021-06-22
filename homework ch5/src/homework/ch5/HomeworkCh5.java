/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.ch5;
import java.util.Scanner;

/**
 *
 * @author melodyhu
 */
public class HomeworkCh5 {

    public static void main(String[] args) {
        // 1
        int total = 1;
        for (int i = 1; i<16; i++){
            if (i % 2 == 0){
                continue;
            }
            else{
                total *= i;
            }
        }
        System.out.println("here is the product of the odd numbers from 1 - 15: " + total);
        
        
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nenter a number from 1 - 30: ");
        int number = scanner.nextInt();
        String stars = "";
        for (int i = 0; i<number; i++){
            stars += "*";
        }
        System.out.println("here are " + number + " asterisks: " + stars + "\n");
        
        
        //3
        int c = 0; //amount of asterisks
        int n = 0; //amount of spaces
        for (int h = 0; h<5; h++){
            System.out.print(" ");
        }
        for (int i = 0; i<41; i++){
            System.out.print("*");
            c++;
            if (c == 1 || c == 4 || c == 9 || c == 16 || c == 25 || c == 32 || c == 37 || c == 40 || c == 41){
                System.out.print("\n");
                for (int b = 0; b<24; b++){
                    System.out.print(" ");
                    n++;
                    if (n == 4 || n == 7 || n == 9 || n == 10 || n == 12 || n == 15 || n == 19 || n == 24)
                        break;
                }
            }
        }
    }
}




    

