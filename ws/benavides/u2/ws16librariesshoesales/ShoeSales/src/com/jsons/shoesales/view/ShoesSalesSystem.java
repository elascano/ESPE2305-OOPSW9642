/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.shoesales.view;

import com.jsons.shoesales.model.PairOfShoes;
import com.jsons.tax.SalesTax;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        price = 20.37F;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        float totalPrice;
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        System.out.println("Ruben Benavides shoe maker");
        pairOfShoes = new PairOfShoes(0, "Venus", "ESCOLAR", price, totalPrice);
        System.out.println("pair of shoes --> " + pairOfShoes);
        
        
        pairOfShoes = new PairOfShoes(1, "Venus", "ESCOLAR", 20.0F, 0);
        System.out.println("pair of shoes --> " + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(2, "Buestan", "casual", price);
        System.out.println("pair of shoes --> " + pairOfShoes);
    }
}
