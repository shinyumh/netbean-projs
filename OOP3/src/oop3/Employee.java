/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author melody hu
 */
public class Employee extends Person implements Cloneable, Comparable{
    private String jobtitle;
    private double salary;    
    
    public Employee() //constructor
    {
        super(); //intialized the Person part; must be first line in constructor
        jobtitle = null;
        salary = 0;
    }
     
    public Employee(String name, int age, String jobtitle, double salary) //constructor
    {
        super.set(name, age); //must be first line in constructor
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    
    public void set(String name, int age, String jobtitle, double salary) //modifier
    {
        super.set(name, age); //caling set for Person part
        this.jobtitle = new String(jobtitle);
        this.salary = salary;
    }
    
    public void setsalary(double salary) //modifier
    {
        this.salary = salary;
    }
    
    public double getsalary() //selector
    {
        return salary;
    }
    
    public void setjobtitle(String jobtitle) //modifier
    {
        this.jobtitle = new String(jobtitle);
    }
    
    public String getjobtitle() //selector
    {
        return jobtitle;
    }
  
    public void print() //selector
    {
        super.print(); //print Person part
        System.out.println(this); //then print Student part
    }
    
    public String toString() //converts the object to a String
    {
        return super.toString() + ", job title: " + jobtitle + ", salary: " + salary;
    }
    
    public boolean equals(Object obj) //using exceptions
    {
        if (obj == null)
            return false;
        //this is a Student and obj is an Object
        Employee p = null;
        try
        {
            p = (Employee) obj; //casting obj to Student
        }
        catch(Exception e)
        {
            return false;
        }
        return (super.equals(obj)&& salary == p.salary && jobtitle.equals(p.jobtitle));
    }
}
