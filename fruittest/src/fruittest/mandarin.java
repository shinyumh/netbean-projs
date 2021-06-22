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
public class mandarin extends orange implements Cloneable{
    private boolean small;
    
    public mandarin(){
        super();
        small = false;
    }
    
    public mandarin(String color, String name, boolean sweet, boolean small){
        super.set(color,name,sweet);
        this.small = small;
    }
    
    public void set(String color, String name, boolean sweet, boolean small)
    {
        super.set(color,name,sweet);
        this.small = small;
    }
    
    public void print(){
        super.print();
        System.out.println(this);
    }
    
    @Override
    public void printshape(){
        String shape = "oval\n";
        System.out.println("the shape of this fruit is " + shape);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "; it is " + small + " that it is small";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        mandarin f = null;
        try
        {
            f = (mandarin) obj;
        }
        catch(Exception e)
        {
            return false;
        }
        return (small == f.small);
    }
    
    public Object clone()
    {
        mandarin p = null;
        try
        {
            p = (mandarin) super.clone();
            p.small = small;
        }
        catch(Exception e)
        {
            return null;
        }
        return p;
    }
}
