/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ecu.ec.observer.controller;

//import edu.ecu.ec.observer.model.IBM;
import edu.ecu.ec.observer.model.IBM;
import edu.ecu.ec.observer.model.Investor;
import edu.ecu.ec.observer.model.Stock;
import edu.ecu.ec.observer.view.InvestorView;

/**
 *
 * @author USER
 */
public class InvestorController {
    
    public static void main(String[] args) {
        Investor s = new InvestorView("Soros");
        Investor b = new InvestorView("Berkshire");
        Stock ibm = new IBM("IBM", 120.00);

        ibm.addObserver(s);
        ibm.addObserver(b);

        ibm.setPrice(120.10);
        ibm.setPrice(121.00);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);
        ibm.setSymbol("IBMTEST");
    }
    
    
}
