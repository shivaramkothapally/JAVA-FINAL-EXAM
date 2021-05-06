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
public class Toy extends Goods implements CGST, SGST
{
  private int minimumAge;

    public Toy(int minimumAge, String description, double price) {
        super(description, price);
        this.minimumAge = minimumAge;
    }
 
    @Override
    public String toString() {
        super.toString();
        return "Toy{" + "minimumAge=" + minimumAge + '}';
    }
  

  @Override
  public double calculateTax()
  {
    return price * (taxRate+stateTaxRate) ;
  }
}
    
    
