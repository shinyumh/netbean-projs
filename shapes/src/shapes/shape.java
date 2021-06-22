/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author melodyhu
 */
abstract public class shape {
    protected double area;
    protected double perimeter;
    protected static int count = 0; // static can be initialized
    
    abstract public void computearea(); // abstract method
    abstract public void computeperimeter(); // no def
    
    public void display(){
        System.out.println("area: " + area + "; perimeter: " + perimeter + "\n");
    }
    
    public String tostring(){
        return "area: " + area + "; perimeter: " + perimeter;
    }
    
    final public static int getcount(){
        return count;
    }
    
    protected void finalize(){
        count--;
    }
}
