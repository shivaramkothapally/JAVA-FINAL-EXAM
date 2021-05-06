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
public class mobiledriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 1 : Shivaram kothapally");
        
        mobile m = new mobile("Samsung", 1234);
        System.out.println("mobile details "+ m.toString());
        System.out.println("Duration of media " + m.calculateDuration());
    }
    
}
