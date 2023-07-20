
package com.codewarriors.tax;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage) {
        float totalAndIva = total + total * ivaPercentage / 100;
        return totalAndIva;
    }

    public static float computeIce(float total, float icePercentage) {
        float totalAndIce = total + total * icePercentage / 100;
        return totalAndIce;
    }

    public static float computeAnnualIncomeTax(float monthlyIncome) {
        float annualIncome = monthlyIncome * 12;
        float incomeTax = 0.0f;
        
        if (annualIncome <= 11290.0f) {
            
            incomeTax = 0.0f;
        } else if (annualIncome <= 14390.0f) {
            incomeTax = (annualIncome - 11290.0f) * 0.05f;
        } else if (annualIncome <= 17990.0f) {
            incomeTax = 155.0f + (annualIncome - 14390.0f) * 0.10f;
        } else if (annualIncome <= 21600.0f) {
            incomeTax = 515.0f + (annualIncome - 17990.0f) * 0.12f;
        } else if (annualIncome <= 43180.0f) {
            incomeTax = 948.0f + (annualIncome - 21600.0f) * 0.15f;
        } else if (annualIncome <= 64770.0f) {
            incomeTax = 4187.0f + (annualIncome - 43180.0f) * 0.20f;
        } else if (annualIncome <= 86370.0f) {
            incomeTax = 8503.0f + (annualIncome - 64770.0f) * 0.25f;
        } else if (annualIncome > 86370.0f) {
            incomeTax = 13903.0f + (annualIncome - 86370.0f) * 0.30f;
        }
        
        return incomeTax;
    }
}

    