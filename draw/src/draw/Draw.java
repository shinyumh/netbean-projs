/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;
import javax.swing.JFrame;
/**
 *
 * @author melodyhu
 */
public class Draw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        drawtest panel = new drawtest();
        JFrame application = new JFrame();
        
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
    }
    
}
