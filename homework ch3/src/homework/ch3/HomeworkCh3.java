/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.ch3;

/**
 *
 * @author melodyhu
 */
public class HomeworkCh3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1
        class account {
            public int balance;
            
            public account(int balance){
            this.balance = balance;
        }
            
            public int withdraw(int money) {
                //this.money = money;
                if (money <= balance) {
                    balance = balance - money;
                }
                else {
                    System.out.println("withdrawal amount exceeded balance amount\n");
                }
                
                return balance;
        }
        }
    
    account accounttest = null;
    accounttest = new account(238423);
    System.out.println(accounttest.withdraw(834238324));
    
    
    
    //2
    class invoice{
        public String partnum;
        public String partd;
        public int quantity;
        public double price;
        
        public invoice(String partnum, String partd, int quantity, double price){
            this.partnum = partnum;
            this.partd = partd;
            this.quantity = quantity;
            this.price = price;
        }
        
        public void setpartnum(String partnum){
            this.partnum = partnum;
        }
        public void setpartd(String partd){
            this.partd = partd;
        }
        public void setquantity(int quantity){
            if (quantity < 0){
                this.quantity = 0;
            }
            else{
                this.quantity = quantity;
            }
        }
        public void setprice(double price){
            if (price < 0.0){
                this.price = 0.0;
            }
            else{
                this.price = price;
            }
        }
        
        public void print(){
            System.out.println("\n" + partnum + " " + partd + " " + quantity + " " + price);
        }
        
        public String getpartnum(){
            return partnum;
        }
        public String getpartd(){
            return partd;
        }
        public int getquantity(){
            return quantity;
        }
        public double getprice(){
            return price;
        }
        
        public double getinvoiceamount(){
            double invoiceamount = quantity * price;
            return invoiceamount;
        }
    }
    
    invoice invoicetest = null;
    invoicetest = new invoice("1. apple", "red and sweet", 2, 0.99);
    invoicetest.print();
    
    invoicetest.setpartnum("2. kiwi");
    invoicetest.setpartd("green and kinda sour");
    invoicetest.setquantity(5);
    invoicetest.setprice(2.33);
    invoicetest.print();
    
    System.out.println("\nquantity: " + invoicetest.getquantity());
    
    System.out.println("\ntotal amount: " + invoicetest.getinvoiceamount());
    
    
    //3
    class employee{
        public String firstname;
        public String lastname;
        public double salary;
        
        public employee(String firstname, String lastname, double salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        }
        public void setfirstname(String firstname){
            this.firstname = firstname;
        }
        public void setlastname(String lastname){
            this.lastname = lastname;
        }
        public void setsalary(double salary){
            if (salary > 0){
                this.salary = salary;
            }
            else{
                System.out.println("salary amount lower than zero; salary is not updated");
            }
        }
        public String getfirstname(){
            return firstname;
        }
        public String getlastname(){
            return lastname;
        }
        public double getsalary(){
            return salary;
        }
        public void print(){
            System.out.println("\n" + firstname + " " + lastname + " " + salary);
        }
    }
    
    employee employeetest = null;
    employeetest = new employee("bob", "minion", 929.23);
    employeetest.print();
    
    employeetest.setfirstname("kevin");
    employeetest.setlastname("steve");
    employeetest.setsalary(-123.223);
    employeetest.print();
    
    System.out.println("first name: " + employeetest.getfirstname());
    System.out.println(employeetest.getfirstname() + "'s salary: $" + employeetest.getsalary());
    }
    }
