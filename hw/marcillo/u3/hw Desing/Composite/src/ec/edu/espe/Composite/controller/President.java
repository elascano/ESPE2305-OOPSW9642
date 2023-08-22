/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Composite.controller;

/**
 *
 * @author USER
 */
class President extends Supervisor{
    private static President president = new President();
    private President(String aName){
        this();
        String name = aName;
    }
    
    private President(){
        super();
        String title = "President";
    }
    
    public void stateName(){
        super.stateName();
    }
    
    public static President getPresident(String aName){
        president.name=aName;
        return President.president;
    }

}
