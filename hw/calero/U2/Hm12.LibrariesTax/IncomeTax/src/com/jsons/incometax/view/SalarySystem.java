
package com.jsons.incometax.view;

import com.jsons.incometax.model.Salary;
import com.jsons.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class SalarySystem {
    
    public static void main(String[] args) {
        
        Salary salary;
        float value;
        float income;
        
        System.out.println("Welcome to my Salary Income tax Calculator System");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the salary: ");
        value = scanner.nextFloat();
        
        income = SalesTax.computeIncomeTax(value);
        
        System.out.println("The Income tax is:" + income);
        
    }
    
}
