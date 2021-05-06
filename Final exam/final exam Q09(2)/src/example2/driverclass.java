/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import static example2.ExceptionDemo.func;
import java.util.Scanner;

/**
 *
 * @author S542269
 */
public class driverclass
{

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException 
   {
       
       System.out.println("Answer for question 9: Shivaram kothapally");
		Scanner in=new Scanner(System.in);
                
		try
                {
		    func(in.nextInt(),in.nextInt());
    		}
                catch(ArithmeticException e)
                {
                    
    		   System.out.println("can't divide by zero");
    		}
                catch(ArrayIndexOutOfBoundsException e)
                {
    		   System.out.println("Out of bounds!");
    		}
		
	}
   }