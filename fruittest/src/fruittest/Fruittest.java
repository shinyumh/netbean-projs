/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruittest;

/**
 *
 * @author melodyhu
 */
public class Fruittest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("count: " + fruit.getcount() + "\n");
        
        int size = 10;
        fruit [] a = new fruit[size];
        
        a[0] = new banana("yellow","ice cream",true);
        a[1] = new orange("orange","navel",true);
        a[2] = new mandarin("orange","navel",false,true);
        a[4] = new orange("orange","blood",true);
        a[5] = new mandarin("orange","navel",true,false);
        a[6] = new banana("yellow","tangerine",true);
        a[8] = new orange("orange","blood",true);
        a[9] = new banana("yellow","baby",true);
        
        orange o1 = (orange) a[5].clone();
        if (a[4].equals(o1)){
            System.out.println("a[4] equals to a[5]");
        }
        else{
            System.out.println("a[4] does not equal to a[5]");
        }
        
        if (a[4].equals(a[8])){
            System.out.println("a[4] equals to a[8]\n");
        }
        else{
            System.out.println("a[4] does not equal to a[8]\n");
        }
        
        for (int i = 0; i<10; i++){
            System.out.println("a["+i+"] - " + a[i]);
            try{
                a[i].printcolor();
            }
            catch(Exception e){
                System.out.println("\n");
                continue;
            }
            
            try{
                a[i].printshape();
            }
            catch(Exception e){
                continue;
            }
        }
        
        System.out.println("count: " + fruit.getcount());
    }
    
}
