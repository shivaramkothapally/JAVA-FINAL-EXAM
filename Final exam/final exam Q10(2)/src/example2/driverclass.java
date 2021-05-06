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
public class driverclass {

    /**
     * @param args the command line arguments
     */

    //method to calculate fibonacci series
    
    
    public static void main(String[] args) {
        int number = 10;
  
        //print first 10 numbers of fibonacci series
        System.out.println ("Fibonacci Series: First 10 numbers:");
        for (int i = 1; i <= number; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
        
        
  
}
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
}
       
}   
    

