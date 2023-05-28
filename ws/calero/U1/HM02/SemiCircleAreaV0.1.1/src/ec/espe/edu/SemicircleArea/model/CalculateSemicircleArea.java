
package ec.espe.edu.SemicircleArea.model;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class CalculateSemicircleArea {
    private double radius;
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void calculateArea() {
        area = (Math.PI * Math.pow(radius, 2)) / 2;
    }
}

