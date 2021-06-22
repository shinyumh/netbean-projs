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
public class GradStudent extends Student implements Cloneable, Comparable{
    private String advisor;
    private int year;    
    
    public GradStudent() //constructor
    {
        super(); //intialized the Person part; must be first line in constructor
        advisor = null;
        year = 0;
    }
     
    public GradStudent(String name, int age, String major, int id, String advisor, int year) //constructor
    {
        super.set(name, age, major, id); //must be first line in constructor\
        this.advisor = advisor;
        this.year = year;
    }
    
    public void set(String name, int age, String major, int id, String advisor, int year) //modifier
    {
        super.set(name, age, major, id); //caling set for Person part
        this.advisor = new String(advisor);
        this.year = year;
    }
    
    public void setyear(int year) //modifier
    {
        this.year = year;
    }
    
    public int getyear() //selector
    {
        return year;
    }
    
    public void setadvisor(String advisor) //modifier
    {
        this.advisor = new String(advisor);
    }
    
    public String getadvisor() //selector
    {
        return advisor;
    }
  
    public void print() //selector
    {
        super.print(); //print Person part
        System.out.println(this); //then print Student part
    }
    
    public String toString() //converts the object to a String
    {
        return super.toString() + ", advisor: " + advisor + ", id: " + year;
    }
    
    public boolean equals(Object obj) //using exceptions
    {
        if (obj == null)
            return false;
        //this is a Student and obj is an Object
        GradStudent p = null;
        try
        {
            p = (GradStudent) obj; //casting obj to Student
        }
        catch(Exception e)
        {
            return false;
        }
        return (super.equals(obj)&& year == p.year && advisor.equals(p.advisor));
    } 
    
    public Object clone()
    {
        GradStudent GradStudent = null;
        try
        {
            GradStudent = (GradStudent) super.clone();
            GradStudent.advisor = new String(advisor);
            //enough since data members are intrinsic/primitive
        }
        catch(Exception e)
        {
            return null;
        }
        return GradStudent;
    }
}
