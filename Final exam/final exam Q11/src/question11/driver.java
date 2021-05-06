/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

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
        System.out.println("Answer for question 11: Shivaram kothapally");

       //creating three ojects for flute class
       
        Flute f1 = new Flute("banusuri", 6);
        Flute f2 = new Flute("bambooo", 5);
        Flute f3 = new Flute("banusuri", 6);

       System.out.println("---------- comparing using dot equals ------");
       
        //comparing f1 with f2 using dot equals method and printing the booelan
        //this will return false in case equals method is not implemented in the flute //class, as this uses .equals built in method
        //in case equals method is implemented then it will return true as this
        //consider the args passed to object are same or not
        System.out.println(f1.equals(f2));
        
        //comparing f2 with f3 using dot equals method and printing the booelan 
        System.out.println(f2.equals(f3));
        
        //comparing f1 with f3 using dot equals method and printing the booelan 
        System.out.println(f1.equals(f3));
        

        System.out.println("---------- comparing using double equals ------");
        
        //comparing f1 with f3 using double equals and printing the booelan
        
        System.out.println(f1 == f2);
        
        //comparing f2 with f3 using double equals and printing the booelan 
        System.out.println(f2 == f2);
        //comparing f3 with f1 using double equals and printing the booelan 
        System.out.println(f3 == f1);

        System.out.println("---------- printing the hashcode values ------");
        //printing the hashcode for the f1 object 
        System.out.println(f1.hashCode());
        //printing the hashcode for the f2 object 
        System.out.println(f2.hashCode());
        //printing the hashcode for the f3 object 
        System.out.println(f3.hashCode());
    }
}
