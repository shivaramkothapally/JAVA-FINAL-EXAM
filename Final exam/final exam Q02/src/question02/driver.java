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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 2 : Shivaram kothapally");
        GeometricObject g1 = new Square(10);
        GeometricObject g2 = new Square(12);
        GeometricObject g3 = new Square(14);
        GeometricObject g4 = new Square(16);
        GeometricObject g5 = new Square(18);

        GeometricObject g[] = new GeometricObject[5];

        g[0] = g1;
        g[1] = g2;
        g[2] = g3;
        g[3] = g4;
        g[4] = g5;

        for (int i = 0; i < g.length; i++) {
            System.out.println("Area " + g[i].getArea());
            g[i].howToColor();
        }
    }

    }
    

