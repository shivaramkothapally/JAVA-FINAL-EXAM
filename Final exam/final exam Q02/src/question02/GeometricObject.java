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
public abstract class GeometricObject implements Colorable {

    String getArea;

    public abstract double getArea();

    @Override
    public abstract void howToColor();
}

