package com.jsons.tax;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeIce(float total, float ivaPercentage, float icePercentage){
        float totalAndIce = 0.0F;
        totalAndIce = totalAndIce + (total/(1+ivaPercentage)*(1+icePercentage));
        return totalAndIce;
    }
    
    public static float computeIncomeTax(float salary){
        float surplus = 0;
        if(salary > 11722 && salary <= 14935){
            surplus = 14935 - salary;
            salary = salary + 0.05F * surplus;
            salary = salary/12;
        }else if(salary > 14935 && salary <= 18666){
            surplus = 18666 - salary;
            salary = 161 + salary + 0.1F * surplus;
            salary = salary/12;
        }else if(salary > 18666 && salary <= 22418){
            surplus = 22418 - salary;
            salary = 534 + salary + 0.12F * surplus;
            salary = salary/12;
        }else if(salary > 22418 && salary <= 32783){
            surplus = 32783 - salary;
            salary = 984 + salary + 0.15F * surplus;
            salary = salary/12;
        }else if(salary > 32783 && salary <= 43147){
            surplus = 43147 - salary;
            salary = 2539 + salary + 0.2F * surplus;
            salary = salary/12;
        }else if(salary > 43147 && salary <= 53512){
            surplus = 53512 - salary;
            salary = 4612 + salary + 0.25F * surplus;
            salary = salary/12;
        }else if(salary > 53512 && salary <= 63876){
            surplus = 63876 - salary;
            salary = 7203 + salary + 0.3F * surplus;
            salary = salary/12;
        }else if(salary > 63876 && salary <= 103644){
            surplus = 103644 - salary;
            salary = 10312 + salary + 0.35F * surplus;
            salary = salary/12;
        }else if(salary > 103644){
            surplus = 103644 - salary;
            salary = 24231 + salary + 0.37F * surplus;
            salary = salary/12;
        } 
        return salary;
    }
        
}
