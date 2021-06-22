/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author melodyhu
 */
public class Complex {
    private double real, imag;
    static int count = 0;
    
    public Complex(){
        count++;
        set(0, 0);
    }
    
    public Complex(double real, double imag){
        count++;
        set(real, imag);
    }
    
    public void set(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public void setreal(double real){
        this.real = real;
    }
    
    public double getreal(){
        return real;
    }
    
    public void setimag(double imag){
        this.imag = imag;
    }
    
    public double getimag(){
        return imag;
    }
    
    public static int getcount(){
        return count;
    }

    protected void finalize(){
        System.out.println("calling finalize()");
        count--;
    }
    
    public String toString(){
        return (real + ", " + imag + "i");
    }
    
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        Complex c = null;
        try{
            c = (Complex) obj;
        }
        catch(Exception e){
            return false;
        }
        return (real == c.real && imag == c.imag);
    }

    public Complex add(Complex c2){
        Complex c = new Complex();
        c.real = real + c2.real;
        c.imag = imag + c2.imag;
        return c;
    }
    
    public Complex sub(Complex c2){
        Complex c = new Complex();
        c.real = real - c2.real;
        c.imag = imag - c2.imag;
        return c;
    }
    
    public Complex mul(Complex c2){
        Complex c = new Complex();
        c.real = real * c2.real - imag * c2.imag;
        c.imag = real * c2.imag + real * c2.imag;
        return c;
    }
    
    public Complex div(Complex c2){
        Complex c = new Complex();
        double d = c2.real * c2.real + c2.imag * c2.imag;
        try{
            c.real = (real * c2.real + imag * c2.imag)/d;
            c.imag = (c2.imag * imag - real * c2.imag)/d;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    
    /*public int compareto(Object obj){
        Complex c = null;
        try{
            c = (Complex) obj;
        }
        catch(Exception e){
            System.out.print
        }
    }*/
}
