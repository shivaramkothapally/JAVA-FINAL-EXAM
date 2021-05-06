/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author S542269
 */
public class car extends engine {
        private String price;

    public car(String price, String model, int year) {
        super(model, year);
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" + "price=" + price + '}';
    }
        
        
        
    
}
