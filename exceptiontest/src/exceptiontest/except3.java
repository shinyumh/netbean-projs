/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

/**
 *
 * @author melodyhu
 */
public class except3 {
    public static void main3(String[] args){
    // TODO code application logic here
        for (int i=0; i < 3; i++)
        {
            //foo();		//illegal
            try
            {
                foo();
            }

            catch(RuntimeException e)
            {
                System.out.println(e);
            }

            catch(Ex1 e)
            {
                //System.out.println(e);
                e.printStackTrace();
            }
        }
    }

    //catch-or-declare rule: Ex1 declared
    public static void foo()
            throws Ex1
    {
        int i = 1, j = 0, k;
        try
        {
            if (j == 0)
                throw new Ex1("I am Ex1 excption");
            //if (j == 0)
            //	throw new RuntimeException("Hello There");
            //System.out.println("Unreachable code if throw happens");
            k = i/j;
        }

        //catch(ArrayStoreException e)	//does not catch the ArithmeticException
        //catch(ArithmeticException e) 	//works	for i/j
        catch(RuntimeException e)		//works	for i/j
        //catch(Exception e)			//Works for i/j & Ex1
        {
            //System.out.println(e);	//try with & without
            e.printStackTrace();	//try with & without
            //return;	//this will make after finally not get called
        }

        finally
        {
            System.out.println("finally called");
        }

        System.out.println("After finally");
    }
}

//User-defined exception
class Ex1 extends Exception
{
    Ex1()
    {
    }

    Ex1(String s)
    {
        super(s);
    }    
}
