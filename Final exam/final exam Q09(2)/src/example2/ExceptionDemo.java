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
public class ExceptionDemo
{
	static void func(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
        {
		   System.out.println(10/a); 
		   int[] arr={1,2,3};
		   System.out.println(arr[b]);
	}
        
}