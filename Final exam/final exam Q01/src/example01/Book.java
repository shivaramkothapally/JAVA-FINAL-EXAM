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
public class Book  extends Goods implements CGST
{
   private String author;

    public Book(String author, String description, double price)
    {
        super(description, price);
        this.author = author;
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Book{" + "author=" + author + '}';
    }
    
   @Override
    public double calculateTax()
    {
      return price * taxRate ;
    }
}