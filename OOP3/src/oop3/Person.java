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
public class Person implements Cloneable, Comparable{
    private String name;
    private int age;
    private static int count = 0; //object counter
    
    //you get the default constructor if you do not have any other constructor
    public Person() //constructor
    {
        count++;
        name = null;
        age = 0;
    }
     
    public Person(String name, int age) //constructor
    {
        count++;
        this.name = name;
        this.age = age;
    }
    
    public void set(String name, int age) //modifier
    {
        this.name = new String(name);
        this.age = age;
    }
    
    public void setAge(int age) //modifier
    {
        this.age = age;
    }
    
    public int getAge() //selector
    {
        return age;
    }
    
    public void setName(String name) //modifier
    {
        this.name = new String(name);
    }
    
    public String getName() //selector
    {
        return name;
    }
  
    public void print() //selector
    {
        //System.out.println("name= " + name + ", age= " + age);
        //same as:
        System.out.println(this);
    }
    
    public String toString() //converts the object to a String
    {
        return "name: " + name + ", age: " + age;
    }
    public static int getCount()
    {
        return count;
    }
    
    protected void finalize()
    {
        System.out.println("Calling finalize()");
        count--;
    }
    
    public boolean equals(Object obj) //using exceptions
    {
        if (obj == null)
            return false;
        //this is a Person and obj is an Object
        Person p = null;
        try
        {
            p = (Person) obj; //casting obj to Person
        }
        catch(Exception e)
        {
            return false;
        }
        return (age == p.age && name.equals(p.name));
    }

    public boolean equals1(Object obj) //using getClass
    {
        if (obj == null)
            return false;
        //this is a Person and obj is an Object
        if (getClass() != obj.getClass()) 
        {
            return false;
        }        
        Person p = (Person) obj; //casting obj to Person
        return (age == p.age && name.equals(p.name));
    }    
    
    public Object clone()
    {
        Person p = null;
        try
        {
            p = (Person) super.clone();
            p.name = new String(name);
            //enough since data members are intrinsic/primitive
        }
        catch(Exception e)
        {
            return null;
        }
        return p;
    }
    
    @Override
    public int compareTo(Object obj)
            //-ve this < obj; 0 this == obj; +ve this > onj
    {
        Person c = null;
        try
        {
            c = (Person) obj;
        }
        catch(Exception e)
        {
            System.out.println("passed class is not a person :O");
            System.exit(0);
        }

        //String p1 = new String(name);
        //String p2 = new String(name);
        
        return name.compareTo(c.name);
    }
}
