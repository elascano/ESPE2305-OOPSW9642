package com.thefamse.tax.sales;

/**
 *
 * @author David Moran
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total *ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeIce(float total, float icePercentage, float ivaPercentage){
        float totalAndIce;
        float ice;
        ice = (total + total * ivaPercentage/100) * icePercentage/100;
        totalAndIce = total + ice;
        return totalAndIce;
    }
    public static float computeIncomeTax(float annualIncome) {
       float incomeTax;
        
        if (annualIncome <= 11722) {
            incomeTax = 0;
        } else if (annualIncome <= 14935) {
            incomeTax = (float) ((annualIncome - 11722) * 0.05);
        } else if (annualIncome <= 18666) {
            incomeTax = (float) (161 + (annualIncome - 14935) * 0.10);
        } else if (annualIncome <= 22418) {
            incomeTax = (float) (534 + (annualIncome - 18666) * 0.12);
        } else if (annualIncome <= 32783) {
            incomeTax = (float) (984 + (annualIncome - 22418) * 0.15);
        } else if (annualIncome <= 43147) {
            incomeTax = (float) (2539 + (annualIncome - 32783) * 0.20);
        } else if (annualIncome <= 53512) {
            incomeTax = (float) (4612 + (annualIncome - 43147) * 0.25);
        } else if (annualIncome <= 63876) {
            incomeTax = (float) (7203 + (annualIncome - 53512) * 0.30);
        } else if (annualIncome <= 103644) {
            incomeTax = (float) (10312 + (annualIncome - 63876) * 0.35);
        } else {
            incomeTax = (float) (24231 + (annualIncome - 103644) * 0.37);
        }
        return (float) incomeTax;
    }

}
