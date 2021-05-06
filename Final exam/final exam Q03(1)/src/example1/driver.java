/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

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
        System.out.println("Answer for question 3 : Shivram kothapally");
        double a = 15;
        System.out.println("double of 15 is " + a);

       
        int b = (int) 15.5;
        System.out.println("int value of 15.5 is " + b);

        
        String d = String.valueOf(a);
        System.out.println("String value of 15 is " + d);

        
        String s = "56";
        int i = Integer.parseInt(s);
        System.out.println("Int value of string 56 is " + i);

        civilServices cs = new civilServices(12313);
       IAS g = new IAS("Shivaram", 1231231);
        cs = g; //polymorphic substitution
        g = (IAS) cs; // casting

    }
    
}
