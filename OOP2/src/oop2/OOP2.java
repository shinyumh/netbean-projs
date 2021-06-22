/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author melodyhu
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       person p1 = null;
       
       //System.out.println("p1 = " + p1);
       p1 = new person("hello",24); // construct a new object
       p1.print();
       //System.out.println("count = " + hello2.getcount());
       p1.setage(74);
       p1.print();
       p1.setname("bob");
       p1.getage();
       System.out.println("p1 age = " + p1.getage() + " p1 name = " + p1.getname());
       //System.out.println("p1 age = " + p1.age); //only works when age is NOT private
       
       // selectors vs. modifiers
        //selectors: view info; does not change anything
        //modifiers: change values
       
       System.out.println("p1 = " + p1);
       System.out.println("p1 = " + p1.getClass().getName() + "@" + Integer.toHexString(p1.hashCode()));
       System.out.println("count = " + p1.getcount());
       
       student s = new student("bob",12,"cis",324324);
       s.print();
       s.getid();
       s.getmajor();
    }
    
}
/