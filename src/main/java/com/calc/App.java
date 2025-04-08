package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculadora c=new Calculadora(5, 8);

        System.out.println("5 + 8 = "+c.suma());
    }
}
