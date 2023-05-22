package ec.edu.espe.SlopeFormule.model;

import java.util.Scanner;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class CoordinatesAxis {
    private float x1Axis, x2Axis, y1Axis, y2Axis,slope;
    private Scanner scanner = new Scanner(System.in);
    
    public void scanData(){
        System.out.println("Enter the first X: ");
        setX1Axis(getScanner().nextFloat());
        System.out.println("Enter the first Y: ");
        setY1Axis(getScanner().nextFloat());
        System.out.println("Enter the second X: ");
        setX2Axis(getScanner().nextFloat());
        System.out.println("Enter the second Y: ");
        setY2Axis(getScanner().nextFloat());
    }

    /**
     * @return the x1Axis
     */
    public float getX1Axis() {
        return x1Axis;
    }

    /**
     * @param x1Axis the x1Axis to set
     */
    public void setX1Axis(float x1Axis) {
        this.x1Axis = x1Axis;
    }

    /**
     * @return the x2Axis
     */
    public float getX2Axis() {
        return x2Axis;
    }

    /**
     * @param x2Axis the x2Axis to set
     */
    public void setX2Axis(float x2Axis) {
        this.x2Axis = x2Axis;
    }

    /**
     * @return the y1Axis
     */
    public float getY1Axis() {
        return y1Axis;
    }

    /**
     * @param y1Axis the y1Axis to set
     */
    public void setY1Axis(float y1Axis) {
        this.y1Axis = y1Axis;
    }

    /**
     * @return the y2Axis
     */
    public float getY2Axis() {
        return y2Axis;
    }

    /**
     * @param y2Axis the y2Axis to set
     */
    public void setY2Axis(float y2Axis) {
        this.y2Axis = y2Axis;
    }

    /**
     * @return the scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * @param scanner the scanner to set
     */
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * @return the slope
     */
    public float getSlope() {
        return slope;
    }

    /**
     * @param slope the slope to set
     */
    public void setSlope(float slope) {
        this.slope = slope;
    }

}
