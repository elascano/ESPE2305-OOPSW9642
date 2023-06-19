/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.codecrafters.shoes.view;

import com.codecrafters.shoes.model.PairOfShoes;
import com.codecrafters.tax.sales.SalexTax;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ShoesSalesSystem {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("Mesias Mariscal Shoe Maker **");
        totalPrice = SalexTax.compute(price,ivaPercentage);
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", price, totalPrice);
        System.out.println("pair of shoes --> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", 20.0F, 22.40F);
        System.out.println("pair of shoes --> " + pairOfShoes);

        price = 10.0F;
        pairOfShoes = new PairOfShoes(1,"Buestan","Casual",price);
        System.out.println("pair of shoes --> " + pairOfShoes);
}
}