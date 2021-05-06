/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.io.EOFException;
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
     * @throws java.io.EOFException
     * @throws java.io.FileNotFoundException
     */
   
        // TODO code application logic here
        public static void main(String[] args) throws EOFException, FileNotFoundException{
        // TODO code application logic here
        System.out.println("Answer for question 8: Shivaram kothapally");
        try {
            Scanner scan = new Scanner(new File("TextInput.txt"));
            
                String k = scan.nextLine();
                if(!scan.hasNext()){
                    throw new EOFException("End of file exception");
                }
            
        } 
        catch(EOFException e){
            System.out.println(e);
        }
    }

    }
    

