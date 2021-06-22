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
public class orange extends fruit implements Cloneable{
    private String name;
    private boolean sweet;
    
    public orange(){
        super();
        name = null;
        sweet = false;
    }
    
    public orange(String color, String name, boolean sweet){
        super(color);
        this.name = name;
        this.sweet = sweet;
    }
    
    public void set(String color, String name, boolean sweet)
    {
        super.set(color);
        this.name = name;
        this.sweet = sweet;
    }
    
    public void print(){
        super.print();
        System.out.println(this);
    }
    
    @Override
    public void printshape(){
        String shape = "sphere\n";
        System.out.println("the shape of this fruit is " + shape);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "; fruit name: " + name + ";  it is " + sweet + " that it is sweet";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        orange f = null;
        try
        {
            f = (orange) obj;
        }
        catch(Exception e)
        {
            return false;
        }
        return (name == f.name && sweet == f.sweet);
    }
    
    public Object clone()
    {
        orange p = null;
        try
        {
            p = (orange) super.clone();
            p.name = new String(name);
            p.sweet = sweet;
        }
        catch(Exception e)
        {
            return null;
        }
        return p;
    }
}
