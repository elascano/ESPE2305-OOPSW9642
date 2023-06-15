/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.Serializable;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class Computer implements Serializable{
    private int id;
    private String brand;
    private String model;
    private int serialNumber;
    private int year;

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", serialNumber=" + serialNumber + ", year=" + year + '}';
    }

public Computer(int id,String brand,String model,int serialNumber,int year){
    this.id=id;
    this.brand=brand;
    this.model=model;
    this.serialNumber=serialNumber;
    this.year=year;
}
       
}
