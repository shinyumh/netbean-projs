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
public class banana extends fruit implements Cloneable{
    private String type;
    private boolean tropical;
    
    public banana(){
        super();
        type = null;
        tropical = false;
    }
    
    public banana(String color, String type, boolean tropical){
        super(color);
        this.type = type;
        this.tropical = tropical;
    }
    
    public void set(String color, String type, boolean tropical)
    {
        super.set(color);
        this.type = type;
        this.tropical = tropical;
    }
    
    public void print(){
        super.print();
        System.out.println(this);
    }
    
    @Override
    public void printshape(){
        String shape = "crescent\n";
        System.out.println("the shape of this fruit is " + shape);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "; fruit type: " + type + "; it is " + tropical + " that it is tropical";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        banana f = null;
        try
        {
            f = (banana) obj;
        }
        catch(Exception e)
        {
            return false;
        }
        return (type == f.type && tropical == f.tropical);
    }
    
    public Object clone()
    {
        banana p = null;
        try
        {
            p = (banana) super.clone();
            p.type = new String(type);
            p.tropical = tropical;
        }
        catch(Exception e)
        {
            return null;
        }
        return p;
    }
}
