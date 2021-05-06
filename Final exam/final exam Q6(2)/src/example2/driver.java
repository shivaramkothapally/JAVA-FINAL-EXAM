/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.Scanner;

/**
 *
 * @author S542269
 */
public class driver {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
   
    
    
      public static void main (String[] args) {
        System.out.println("Answer for question 6 : Shivaram kothapally");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter baggage weight :");
            try{
                validWeight(in.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
        }
      }
    private static void validWeight(int nextInt)  throws WeightLimitExceeded{
        if(nextInt>15)
            throw new WeightLimitExceeded(nextInt);
        else
            System.out.println("You are ready to fly!");
      }
    }

