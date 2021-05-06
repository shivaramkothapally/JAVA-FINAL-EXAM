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
public class ExceptionDemo
{
	static void canVote(int age)
        {
         if(age<18)
             
            try
            {
                throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("you are not an adult!");
            }
		else
		   System.out.println("you can vote!");
	}
}
