/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.Scanner;

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
        System.out.println("Answer for question 10: Shivaram kothapally");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number which all odd numbers are printed ");
        int s = scan.nextInt();
        printODD(s, 1);
    }

    private static void printODD(int maxNumber, int startingNumber) {

            if (startingNumber != maxNumber) {
                if (startingNumber % 2 != 0) {
                    System.out.println(startingNumber + " is ODD number");
                }
                printODD(maxNumber, startingNumber+1);
            }
    }

        // TODO code application logic here
    }
    

