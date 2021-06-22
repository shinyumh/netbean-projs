/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.ch4;
import java.util.Scanner;

/**
 *
 * @author melodyhu
 */
public class HomeworkCh4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        int trips = 0;
        double recordmiles = 0, recordgallons = 0;
        while (true){
            double miles = 0, gallons = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("enter miles driven: ");
            miles = input.nextInt();
            System.out.print("enter gallons used: ");
            gallons = input.nextInt();
            
            if (miles != 0){
                trips++;
                recordmiles += miles;
                recordgallons += gallons; 
                double mpg = miles/gallons;
                double rmpg = recordmiles/recordgallons;
                System.out.println("for this trip, you averaged " + mpg + " miles per gallon.");
                System.out.println("for the past " + trips + " trips, you averaged " + rmpg + " miles per gallon.\n");
            }
            else{
                break;
            }
        }
        
        
        //2
        String name = "", print = "";
        int rate = 0, hours = 0, num = 0;
        for (int i=0; i<3;i++){
            num++;
            int salary = 0;
            System.out.print("\n" + num + ". enter employee name: ");
            Scanner input = new Scanner(System.in);
            name = input.next();
            System.out.print(num + ". enter amount of hours " + name + " worked in the past week: ");
            hours = input.nextInt();
            System.out.print(num + ". enter " + name + "'s hourly rate: ");
            rate = input.nextInt();
            
            if (hours <= 40){
                salary = hours * rate;
            }
            else{
                salary = (40 * rate) + ((hours - 40) * (rate + rate / 2));
            }
            
            print = print + name + ": $" + salary + "\n";
        }
        System.out.println("\nhere are 3 empolyees' salary for the last week:\n" + print);
        
        
        //3
        Scanner scanner = new Scanner(System.in);
        String lnames = "", salesname = "";
        int counter = 0, number = 0, largest = 0;
        for (int i=0;i<10;i++){
            System.out.print("enter name: ");
            salesname = scanner.next();
            System.out.print("enter units sold by " + salesname + ": ");
            number = scanner.nextInt();
            
            if (largest < number){
                largest = number;
                lnames = salesname;
            }
            else if(largest > number){
                continue;
            }
            else{
                continue;
            }
            
            counter++;
        }
        System.out.println("\n" + lnames + " is the winner with " + largest + " units sold.");

        
        //4
        System.out.println("N   10*N    100*N   1000*N\n\n");
        int n = 0;
        for (int i=1; i<6; i++){
            n = i;
            int a = 10*n, b = 100*n, c = 1000*n;
            System.out.println(n + "    " + a + "    " + b + "    " + c);
        }
    }
    
}
