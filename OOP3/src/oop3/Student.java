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
public class Student extends Person implements Cloneable, Comparable{
    private String major;
    private int id;
    

    //you get the default constructor if you do not have any other constructor
    public Student() //constructor
    {
        super(); //intialized the Person part; must be first line in constructor
        major = null;
        id = 0;
    }
     
    public Student(String name, int age, String major, int id) //constructor
    {
        super(name, age); //must be first line in constructor
        this.major = major;
        this.id = id;
    }
    
    public void set(String name, int age, String major, int id) //modifier
    {
        super.set(name, age); //caling set for Person part
        this.major = new String(major);
        this.id = id;
    }
    
    public void setId(int id) //modifier
    {
        this.id = id;
    }
    
    public int getId() //selector
    {
        return id;
    }
    
    public void setMajor(String major) //modifier
    {
        this.major = new String(major);
    }
    
    public String getMajor() //selector
    {
        return major;
    }
  
    public void print() //selector
    {
        super.print(); //print Person part
        System.out.println(this); //then print Student part
    }
    
    public String toString() //converts the object to a String
    {
        return super.toString() + ", major: " + major + ", id: " + id;
    }
    
    public boolean equals(Object obj) //using exceptions
    {
        if (obj == null)
            return false;
        //this is a Student and obj is an Object
        Student p = null;
        try
        {
            p = (Student) obj; //casting obj to Student
        }
        catch(Exception e)
        {
            return false;
        }
        return (super.equals(obj)&& id == p.id && major.equals(p.major));
    }    
    
    public Object clone()
    {
        Student s = null;
        try
        {
            s = (Student) super.clone();
            s.major = new String(major);
            //enough since data members are intrinsic/primitive
        }
        catch(Exception e)
        {
            return null;
        }
        return s;
    }
}

