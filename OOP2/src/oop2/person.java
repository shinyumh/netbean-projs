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
public class person {
    private String name;
    private int age;
    static int count = 0; //object counter
    
    
    public person(String name, int age){
    count++;
    this.name = name;
    this.age = age;
    
    //public void set(String name, int age){
        
    //}
    }
    public void print(){
        //System.out.println("\nname: " + name + ", age = " + age);
        System.out.println(this);
    }
    
    public void setage(int age){
        this.age = age;
    }
    
    public int getage(){
        return age;
    }
    
    public void setname(String name){
        this.name = new String(name);
    }
    
    public String getname(){
        return name;
    }
    public int getcount(){
        return count;
    }
}
