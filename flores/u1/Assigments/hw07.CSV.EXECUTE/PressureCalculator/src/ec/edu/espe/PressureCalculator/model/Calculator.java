/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PressureCalculator.model;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class Calculator {
    float pressure;
    
    public float calculatePressure(float force, float area) {
        pressure = force/area;
        return pressure;
        
    }
    
}
