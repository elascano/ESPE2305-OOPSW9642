/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.espe.edu.model;

/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class Velocity {
    private double distance;
    private double time;
    
    public Velocity(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    
    public double calculateVelocity() {
        return distance / time;
    } 
}
