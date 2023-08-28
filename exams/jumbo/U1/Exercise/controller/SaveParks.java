/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exercise.controller;

import ec.edu.espe.Exercise.Parks;
import ec.edu.espe.Exercise.model.Dress;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander J
 */
public class SaveParks {
     Scanner scanner = new Scanner(System.in);
    InventoryManager inventoryManager = new InventoryManager();
    BillingSystem billingSystem = new BillingSystem();
    
    public void createSale(ArrayList<Dress> cart, float totalPrice, float taxes){
        String name, email, idCard;
        
        System.out.print("Ingrese nombre del cliente: ");
        name = scanner.next();
        System.out.print("Ingrese correo electronico del cliente: ");
        email = scanner.next();
        System.out.print("Ingrese cedula cliente: ");
        idCard = scanner.next();
        
        Parks parks = new Parks(chair, courts, tree);
        for(Dress dressOnCart : cart) {
            for(Dress dressOnInventory : inventoryManager.getDressList()){
                if(dressOnCart.getName().equalsIgnoreCase(dressOnInventory.getName())) {
                    int quantity = dressOnInventory.getQuantity()-dressOnCart.getQuantity();
                    if (quantity == 0)
                        inventoryManager.getDressList().remove(dressOnInventory);
                    else
                        dressOnInventory.setQuantity(quantity);
                }
                    
            }
            
        }
        billingSystem.createBill(cart, parks, totalPrice, taxes);
}
