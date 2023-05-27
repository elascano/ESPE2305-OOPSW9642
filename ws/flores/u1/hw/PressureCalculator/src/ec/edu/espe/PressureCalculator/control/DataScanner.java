/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PressureCalculator.control;

import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class DataScanner {
    private Scanner scanner = new Scanner(System.in);
    private float force;
    private float area;
    private int option;
    
    public void GetData(){
        System.out.println("Enter the force");
        setForce(getScanner().nextFloat());
        System.out.println("Enter the area");
        setArea(getScanner().nextFloat());
        
    }
    
    public int GetOption() {
        System.out.println("Press 1 to calculate another pressure");
        option = getScanner().nextInt();
        
        return option;
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
     * @return the force
     */
    public float getForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(float force) {
        this.force = force;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }
    
}