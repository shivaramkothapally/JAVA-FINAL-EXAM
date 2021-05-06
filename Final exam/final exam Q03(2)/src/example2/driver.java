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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 3: Shivaram kothapally");
        
        double d = 14;
        System.out.println("double of 14 is " + d);

        
        int b = (int) 256.89;
        System.out.println("int value of 256.89 is " + b);

        
        String s = String.valueOf(d);
        System.out.println("String value of 14 is " + d);

      
        String i = "122";
        int t = Integer.parseInt(i);
        System.out.println("Int value of string 14 is " + t);
        
        engine en = new engine( "petrol engine",2015);
        
        car c = new car("25000","diesel engine", 2018);
        
        en = c;
        c = (car) en;
        System.out.println("Casting "+ c.toString());
    }

    }
    

