/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;

/**
 *
 * @author melodyhu
 */
public class complex implements Cloneable, Comparable{
    private double real, imag;
    static int count = 0;
    
    public complex()
    {
        count++;
        set(0, 0);
    }
    
    public complex(double real, double imag)
    {
        count++;
        set(real, imag);
    }
    
    public void set(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public double getReal()
    {
        return real;
    }

    public void setImag(double imag)
    {
        this.imag = imag;
    }

    public double getImag()
    {
        return imag;
    }

    public static int getCount()
    {
        return count;
    }

    public static void setCount(int c)
    {
        count = c;
    }

    protected void finalize()
    {
            count--;
    }
    
    public String toString()
    {
        return (real + ", " + imag + "i");
    }
    
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        complex c = null;
        try
        {
                c = (complex) obj;
        }
        catch(Exception e)
        {
            return false;
        }
        return (real == c.real && imag == c.imag);
    }

    public Object clone()
    {
        Object obj = null;
        try
        {
            obj = super.clone();
            //This is enough since data members are intrinsic/primitive
        }
        catch(Exception e)
        {
            return null;
        }
        return obj;
    }    
    
    public int compareTo(Object obj)
    {
        complex c = null;
        try
        {
            c = (complex) obj;
        }
        catch(Exception e)
        {
            System.out.println("Passed class is not complex");
            System.exit(0);
        }

        Double Len1 =
            new Double(real*real + imag * imag);
        Double Len2 =
            new Double(c.real*c.real + c.imag * c.imag);

        return Len1.compareTo(Len2);
    }

    public complex add(complex c2)
    {
        complex c = new complex();
        c.real = real + c2.real;
        c.imag = imag + c2.imag;
        return c;
    }

    public complex sub(complex c2)
    {
        complex c = new complex();
        c.real = real - c2.real;
        c.imag = imag - c2.imag;
        return c;
    }

    public complex mul(complex c2)
    {
        complex c = new complex();
        c.real = real * c2.real - imag * c2.imag;
        c.imag = real * c2.imag + imag * c2.real;
        return c;
    }
    
    public complex div(complex c2)
    {
        complex c = new complex();
        double den = c2.real * c2.real + c2.imag * c2.imag;
        try
        {
            c.real = (real * c2.real + imag * c2.imag)/den; 
            c.imag = (c2.real * imag - real * c2.imag)/den;    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return c;
    }
}
