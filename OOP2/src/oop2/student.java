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
public class student extends person{
    private String major = null;
    private int id = 0;
    private int count = 0;
    
    /*public student(){
        major = null;
        id = 0;
    }*/
    
    public student(String name, int age, String major,int id){
        super(name,id);
        this.major = major.toString();
        this.id = id;
    
}
    public void print(){
        //System.out.println("\nname: " + name + ", age = " + age)
        super.print();
        System.out.println(this.toString());
}
    
    public void setid(int id){
        this.id = id;
    }
    
    public int getid(){
        return id;
    }
    
    public void setmajor(String major){
        this.major = new String(major);
    }
    
    public String getmajor(){
        return major;
    }
    public int getcount(){
        return count;
    }
}
