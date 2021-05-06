/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example3;

import java.util.ArrayList;

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
        ArrayList<String> A = new ArrayList<>();
        A.add("nick");
        A.add("Lara");
        A.add("Samy");
        A.add("Stark");
        A.add("Tyrion");
        String s = "Tyrion";
        int l = A.size()-1;
        serElement(A, 0,l , s);
    }
    private static void serElement(ArrayList arr, int sm, int l, String n) {
        if(l <1){
            System.out.println("Element is not present");
        }
       else if(arr.get(sm) == n){
            System.out.println("Element "+n+" is present at " +sm+ " index of array");
        }
       else if(arr.get(l)==n){
            System.out.println("Element "+n+" is present at " +l+ " index of array");
        }else{
            serElement(arr, sm+1, l-1, n);
       }
    }
}