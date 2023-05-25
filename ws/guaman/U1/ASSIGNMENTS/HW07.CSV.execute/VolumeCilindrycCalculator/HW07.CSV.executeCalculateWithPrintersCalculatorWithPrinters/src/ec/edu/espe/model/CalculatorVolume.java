

package ec.edu.espe.model;

/**
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
import java.util.Scanner;

public class CalculatorVolume {

private double height;
private double radius;
private double volume;

    @Override
    public String toString() {
        return (height +","+ radius +","+ volume);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void calculateCylinderVolume() {
        volume = Math.PI * radius * radius * height; 
        
    }
    public  void showDatas(){
        System.out.println("The value of radius is: "+radius);
        System.out.println("The value of height is: "+height);
    }

    public void displayResult(){
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

    
