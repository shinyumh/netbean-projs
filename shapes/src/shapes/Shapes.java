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
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //shape x = new shape();
        //shape x = new square(9);
        square y = new square();
        y.square(23);
        y.computearea();
        y.computeperimeter();
        y.display();
        
        y.set(7);
        y.computearea();
        y.computeperimeter();
        y.display();
        
        rectangle x = new rectangle();
        x.rectangle(23,4);
        x.computearea();
        x.computeperimeter();
        x.display();
        
        circle z = new circle();
        z.circle(5);
        z.computearea();
        z.computeperimeter();
        z.display();
    }
    
}
