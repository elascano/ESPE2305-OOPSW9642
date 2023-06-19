/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.tax.sales;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class SalexTax {
    
    
    public static float compute(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva= total + total* ivaPercentage/100;
        return totalAndIva;
        
    }
    
    public static float cpmputeIce(float total, float icePercetage){
        float totalAndIce =0.0F;
        return totalAndIce;
                
    }
}
