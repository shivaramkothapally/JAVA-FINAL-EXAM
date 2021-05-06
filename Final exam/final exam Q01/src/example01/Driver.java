/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example01;

/**
 *
 * @author Shivaram kothapally
 */
public class Driver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Answer for question 1 : Shivaram kothapally");
        Goods gd = new Goods( "bubble bath", 1.40 );
        Food  fd = new Food ( 5.45, "carbohydrate", 1500 );
        Book  bk = new Book ( "Emma", "Austen", 24.67 );
        Toy   ty = new Toy  ( 8, "ironman", 8.5 );
        
    System.out.println(ty.toString() + "Tax is: " + ty.calculateTax() + "\n" );    
    System.out.println( bk.toString() + "Tax is: " + bk.calculateTax() + "\n" );

  }
}