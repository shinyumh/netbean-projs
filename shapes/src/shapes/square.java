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
public class square extends shape{
    private double side;
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
    public void computearea(){
        area = side * side;
    }
    public void computeperimeter(){
        perimeter = side * 4;
    }
    public void display(){
        System.out.println("square: ");
        super.display();
    }
}
