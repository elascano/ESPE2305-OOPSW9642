
package ec.espe.edu.model;

/**
 *
 * @author USER
 */

public class Result {
    private double radius;
    private double height;
    private double volume;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public void calculateVolume() {
        volume = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
