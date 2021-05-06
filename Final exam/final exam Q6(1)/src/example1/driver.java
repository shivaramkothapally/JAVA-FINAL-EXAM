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
public class driver
{

    /**
     * @param args the command line arguments
     */
  
       
        public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
System.out.println("Answer for question 6: Shivaram Kothapally");
        try {
            System.out.print("Enter first number: ");
            int num1, num2;
            num1 = sc.nextInt();
            System.out.print("Enter second number");
            num2 = sc.nextInt();
            if(num1 == 0 || num2 ==0){
                throw new Sinundefined("Number can't be zero");
            }
            System.out.println( num1 * num2);
        } catch (Sinundefined e) {
            System.out.println(e);
        }
System.out.println("*****************");

        try
        {
            Scanner scan = new Scanner(new File("usersCallLog.txt"));
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found exception");
        }

   }

}
