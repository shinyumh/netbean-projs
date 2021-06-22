/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneexam;
import java.util.Scanner;

/**
 *
 * @author melodyhu
 */
public class Phoneexam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) //terminate at 100
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an alphanumeric number (hit enter to quit): ");
            String line = sc.nextLine();
            if (line.length() <= 1)
                break;

            char [] ca = line.toCharArray();
            int num1 = Tools.lettersOrDigits(ca);
            int num2 = Tools.lettersOrDigits(line);
            System.out.println("Valid numbers or digits: " + num1 + ", same as " + num2);
            if (num1 > 0)
            {
                ca = Tools.keepAlphaNumeric(ca);
                String sa = Tools.keepAlphaNumeric(line); 
		//ca and sa now have only digits and letters
                
                String s1 = Tools.toDigits(sa); 
                System.out.println("Digits s1: " + s1);
                String s2 = Tools.toLetters(sa); 
                System.out.println("Letters s2: " + s2); 
                
                String s3 = Tools.toDigits(ca);              
                System.out.println("Digits s3: " + s3); 
                String s4 = Tools.toLetters(ca); 
                System.out.println("Letters s4: " + s4 + "\n"); 
            }

        }
    }
    
}
