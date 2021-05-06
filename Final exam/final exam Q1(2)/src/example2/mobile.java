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
public class mobile extends app implements musicplayer,videoplayer {

    private String name;
    private double  price;
    public mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getAppversion() {
       return 2.4;
    }

    @Override
    public int calculateDuration() {
        return (numberofsongs*5) + (numberofvideos*2);
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price ;
    }

    @Override
    public double getAppvr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
