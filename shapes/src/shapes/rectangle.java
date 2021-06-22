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
public class rectangle extends shape{
    private double width, length;
    
    public rectangle(){
        width = 0;
        length = 0;
        count++;
    }
    public void rectangle(double width, double length){
        this.width = width;
        this.length = length;
        count++;
    }
    public void set(double width, double length){
        width = width;
        length = length;
    }
    public void computearea(){
        area = width * length;
    }
    public void computeperimeter(){
        perimeter = 2 * width + 2 * length;
    }
    public void display(){
        System.out.println("rectangle: ");
        super.display();
    }
}
