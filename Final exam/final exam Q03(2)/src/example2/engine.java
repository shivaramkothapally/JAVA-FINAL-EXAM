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
public class engine {
        private String model;
    private int year;

    public engine(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "engine{" + "model=" + model + ", year=" + year + '}';
    }

   

    
    
}
