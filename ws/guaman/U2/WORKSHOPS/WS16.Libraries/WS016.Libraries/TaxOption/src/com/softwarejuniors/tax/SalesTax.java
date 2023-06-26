
package com.softwarejuniors.tax;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
     public static float ComputeIce(float total, float icePercentage){
        float totalAndIce=0.0F;
        return totalAndIce;
    }
    //public static float compute
    
}
