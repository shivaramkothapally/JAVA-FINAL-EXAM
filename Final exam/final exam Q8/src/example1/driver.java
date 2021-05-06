/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S542269
 */
public class driver {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer for question 8: Shivaram kothapally");

        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("written1.txt"));
        } catch (FileNotFoundException sr) {
            System.out.println("File not found exception");
        }

   }
}



    
    

