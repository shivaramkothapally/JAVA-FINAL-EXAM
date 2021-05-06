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
public class WeightLimitExceeded extends RuntimeException{
    WeightLimitExceeded(int x){
        System.out.print("excess weight"+Math.abs(15-x)+" kg : ");
    }
}
    

