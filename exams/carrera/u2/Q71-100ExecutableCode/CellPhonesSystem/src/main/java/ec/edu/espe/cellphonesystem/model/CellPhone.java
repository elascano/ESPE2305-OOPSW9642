/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cellphonesystem.model;

import ec.edu.espe.cellphonesystem.controller.CellPhoneController;
import javax.swing.CellEditor;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class CellPhone {
    CellPhoneController cellPhoneController = new CellPhoneController();
    int id;
    String model;
    int memory;
    String brand;
    float price;

    public CellPhone(int id, String model, int memory, String brand) {
        this.id = id;
        this.model = model;
        this.memory = memory;
        this.brand = brand;
        this.price = cellPhoneController.calculatePrice(memory, brand);
    }
    
    
    
}
