/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsons.vehiclecrud.utils;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class PriceWithDiscount {
    public static double computePrice(double price){
        price = price - (price * 0.15);
        return price;
    }
}
