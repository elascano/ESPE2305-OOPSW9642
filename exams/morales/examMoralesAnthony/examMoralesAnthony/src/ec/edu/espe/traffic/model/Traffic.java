/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.traffic.model;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class Traffic {
    private String cars;
    private String buses;
    private String trucks;

    public Traffic(String cars, String buses, String trucks) {
        this.cars = cars;
        this.buses = buses;
        this.trucks = trucks;
    }

    /**
     * @return the cars
     */
    public String getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(String cars) {
        this.cars = cars;
    }

    /**
     * @return the buses
     */
    public String getBuses() {
        return buses;
    }

    /**
     * @param buses the buses to set
     */
    public void setBuses(String buses) {
        this.buses = buses;
    }

    /**
     * @return the trucks
     */
    public String getTrucks() {
        return trucks;
    }

    /**
     * @param trucks the trucks to set
     */
    public void setTrucks(String trucks) {
        this.trucks = trucks;
    }
    
}
