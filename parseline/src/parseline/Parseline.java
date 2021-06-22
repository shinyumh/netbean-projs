/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseline;
import java.util.Scanner;

/**
 *
 * @author melodyhu
 */
public class Parseline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int maxlen = 132;
        char [] ca = new char[maxlen];
        while (true){
            Scanner input = new Scanner(System.in);
            String str;
            System.out.print("enter something > ");
            str = input.nextLine();
            if (str.length()< 2){
                break;
            }
            else{
                System.out.println("\nyou entered: " + str);
                System.out.println("total character count: " + str.length());
            }
            
            ca = str.toCharArray();
            System.out.println("char array: " + ca.length);
            int letters = tools.letters(ca);
            System.out.println("letters: " + letters);
            
            int numbers = tools.numbers(ca);
            System.out.println("numbers: " + numbers);
            
            int white = tools.white(ca);
            System.out.println("white spaces: " + white);
            
            int punctuation = tools.punctuation(ca);
            System.out.println("punctuations: " + punctuation);
            
            String keepeverything = tools.keepeverything(ca);
            System.out.println("everything but spaces: " + keepeverything);
            
            String deletejunk = tools.deletejunk(ca);
            System.out.println("everything but punctuations: " + deletejunk + "\n");
        }
    }
    
}
