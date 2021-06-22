/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
//import java.lang.Math; ----> lang is automatically imported
/**
 *
 * @author melodyhu
 */
public class circle extends shape{
    private double radius;
    public circle(){
        radius = 0;
        count++;
    }
    public void circle(double radius){
        this.radius = radius;
        count++;
    }
    public void set(double radius){
        radius = radius;
    }
    public void computearea(){
        area = Math.PI * (radius * radius)
;    }
    public void computeperimeter(){
        perimeter = Math.PI * 2 * radius;
    }
    public void display(){
        System.out.println("circle: ");
        super.display();
    }
}
