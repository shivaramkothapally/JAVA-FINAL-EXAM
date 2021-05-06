/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542269
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    private double radius;
    private double area = getPi() * radius * radius;

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    

    @Override
    public double getArea() {
        return getPi() * radius * radius;
    }

    public double getPi() {
        return Math.PI;
    }

    @Override
    public String toString() {
        return "ComparableCircle{" + "radius=" + radius + '}';
    }

    @Override
    public int compareTo(ComparableCircle arg0) {
        return Double.valueOf(this.area).compareTo(arg0.getArea());
    }

}
