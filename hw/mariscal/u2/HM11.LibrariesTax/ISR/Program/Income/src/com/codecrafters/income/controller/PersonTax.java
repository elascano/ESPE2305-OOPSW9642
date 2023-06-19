/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.income.controller;

import com.codecrafters.shoes.view.IncomeTax;
import java.text.DecimalFormat;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class PersonTax {

    private double Income;
    private double Tax;
    private DecimalFormat df = new DecimalFormat("#.##");

    public PersonTax(double Income) {
        this.Income = Income;
        this.Tax = IncomeTax.calculateTaxRenta(Income);
        
    }

    public String toString() {
        String formattedIncome = df.format(Income);
        String formattedTax = df.format(Tax);
        return "PersonTax{" + "Income=" + formattedIncome + ", Tax=" + formattedTax + '}';
    }

    
}
