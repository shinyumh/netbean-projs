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
public abstract class fruit implements Cloneable{
    protected String color;
    private static int count = 0;
    
    public fruit(){
        count++;
        color = null;
    }
    
    public fruit(String color){
        count++;
        this.color = color;
    }
    
    public static int getcount(){
        return count;
    }
    
    public void set(String color)
    {
        this.color = color;
    }
    
    public void print(){
        System.out.println(color);
    }
    
    public void printcolor(){
        System.out.println("the color of the fruit is " + color);
    }
    
    abstract void printshape();
    
    @Override
    public String toString()
    {
        return "fruit color: " + color;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        fruit f = null;
        try
        {
            f = (fruit) obj;
        }
        catch(Exception e)
        {
            return false;
        }
        return (color == f.color);
    }
    
    public Object clone()
    {
        fruit p = null;
        try
        {
            p = (fruit) super.clone();
            p.color = new String(color);
        }
        catch(Exception e)
        {
            return null;
        }
        return p;
    }
}
