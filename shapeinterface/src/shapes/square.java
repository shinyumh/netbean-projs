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
public class square implements shape{
    private double side;
    protected double area;
    protected double perimeter;
    protected static int count = 0; // static can be initialized
    
    abstract public void computearea(); // abstract method
    abstract public void computeperimeter(); // no def
    
    public square(){
        side = 0;
        count++;
    }
    public void square(double side){
        this.side = side;
        count++;
    }
    public void set(double side){
        this.side = side;
    }
}
