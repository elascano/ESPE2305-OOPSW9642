/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

/**
 * @author David Moran, The_FAMSE
 */
public class Tax {

    private static Tax instance;
    private float taxRate; 

    private Tax() {
    }

    public static Tax getInstance() {
        if (instance == null) {
            instance = new Tax();
        }
        return instance;
    }

    public void setTaxRate(float rate) {
        this.taxRate = rate;
    }

    public float calculateTax(float price) {
        return price * taxRate; 
    }
}








