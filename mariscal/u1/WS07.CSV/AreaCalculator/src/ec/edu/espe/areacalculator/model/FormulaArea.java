package ec.edu.espe.areacalculator.model;

import java.util.Scanner;

public class FormulaArea {
    private float diameter;
    private float circleArea;
    private static Scanner scanner = new Scanner(System.in);

    FormulaArea(float diameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void readData() {
        System.out.println("Enter the diameter: ");
        diameter = scanner.nextFloat();
        calculateCircleArea();
    }

    public float getDiameter() {
        return diameter;
    }

    public float calculateCircleArea() {
        circleArea = (float) (Math.PI * Math.pow(diameter / 2, 2));
        return circleArea;
    }
}
