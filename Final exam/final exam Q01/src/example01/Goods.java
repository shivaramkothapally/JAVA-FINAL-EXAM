/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example01;

/**
 *
 * @author S
 */
public class Goods {
   

 private String description;
 double price;

    public Goods(String description, double price)
    {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Goods{" + "description=" + description + ", price=" + price + '}';
    }
}

    