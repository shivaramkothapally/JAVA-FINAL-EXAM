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
public class Food extends Goods
{
   private double calories;

    public Food(double calories, String description, double price) {
        super(description, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        super.toString();
        return "Food{" + "calories=" + calories + '}';
    }
    
}

   
