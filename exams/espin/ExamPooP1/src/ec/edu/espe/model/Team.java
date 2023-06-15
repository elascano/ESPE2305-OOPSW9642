/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class Team {
    private ArrayList <SoccerManagers> soccerManager;
    
    @Override
    public String toString() {
        return "Soccer Team: " + soccerManager"\n";
    }
    
    public Purchase() {
        
    }

    public SoccerManager(ArrayList<SoccerManagers> soccerManager) {
        this.soccerManager = soccerManager;
    }
    
    public void toPurchaseHardwareComponents(ArrayList <HardwareComponent> hardwareComponents, HardwareComponent purchasedHardwareComponent){
        hardwareComponents.add(purchasedHardwareComponent);
        setCost(purchasedHardwareComponent.getTotalCost());
        
    }
    

    public ArrayList <HardwareComponent> getHardwareComponents(){
        return hardwareComponents;
    }

    public void setHardwareComponents(ArrayList <HardwareComponent> hardwareComponents) {
        this.hardwareComponents = hardwareComponents;
    }

}
