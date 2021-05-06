    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author S542269
 */
public class Square extends GeometricObject implements Colorable {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
   
    public double getArea() {
        return sideLength * sideLength;
    }

}

