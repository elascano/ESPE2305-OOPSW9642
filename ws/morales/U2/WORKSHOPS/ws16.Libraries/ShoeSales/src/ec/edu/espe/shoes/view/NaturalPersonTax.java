package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.NaturalPersonController;
import ec.edu.espe.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class NaturalPersonTax {
        public static void calculateNaturalPerson(){
        Scanner entrada = new Scanner(System.in);
        NaturalPersonController naturalPerson;
        String name;
        float year;
        float salary;
        float incomeTax;
        float totalSalary;
        float total = 0.00F;
        
        System.out.println("<----------------------------------------------->");
        System.out.println("\tIncome Tax Calculator");
        System.out.println("Enter your name:");
        name = entrada.nextLine();
        System.out.println("Enter the year:");
        year = entrada.nextFloat();
        System.out.println("Enter your salary:");
        salary = entrada.nextFloat();
        System.out.println("<----------------------------------------------->");
        
        incomeTax = SalesTax.computeIr(salary);
        totalSalary = salary - incomeTax;

        naturalPerson = new NaturalPersonController(1, name, year, salary, incomeTax, totalSalary);
        System.out.println("Income Tax -->" +naturalPerson);
    }
}
