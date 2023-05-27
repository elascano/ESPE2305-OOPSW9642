
package ec.edu.espe.parallelogramcalculations.model;

import java.util.Scanner;

/**
 *
 * @author Jeffrey Manobanda, Codecrafters Team, DCCO-ESPE
 */
public class Parallelogram {
    private double base, height, side, area, perimeter;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Scanner getScanner() {
        return scanner;
    }
    private Scanner scanner = new Scanner(System.in);
    
    public void dataregister() {
       
        System.out.println("Enter the measurement of the base\t");
        setBase(getScanner().nextDouble());
   
        System.out.println("Enter the height measurement\t");
        setHeight(getScanner().nextDouble());

        System.out.println("Enter the measurement of one side\t");
        setSide(getScanner().nextDouble());
    }
    
    public static double CalArea(double base, double height,double side) {
        double area = base*height;
        return area;
    }
    
    public static double CalPerimeter(double base, double height,double side) {
        double perimeter = (2*(base+side));
        return perimeter;
    }

}

