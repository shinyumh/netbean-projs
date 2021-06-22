/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;
import java.util.Scanner;

/**
 *
 * @author melodyhu
 */
public class Phonenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        while (true){
            Scanner scanner = new Scanner(System.in);
            String line;
            System.out.print("enter a phone number (can be numbers, letters, or a combo of both): ");
            line = scanner.nextLine();
            if (line.length()<=1)
                break;
            String c = tools.todigit(line);
            System.out.println("here is the phone number you entered: " + c);
            System.out.println("here is the optional phone number: " + tools.havedashes(c));
        }
    }
    
}
