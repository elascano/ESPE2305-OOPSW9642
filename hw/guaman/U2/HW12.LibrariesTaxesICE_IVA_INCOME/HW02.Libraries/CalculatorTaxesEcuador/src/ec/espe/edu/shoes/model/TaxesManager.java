
package ec.espe.edu.shoes.model;

import com.softwarejuniors.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class TaxesManager {
    Scanner sc = new Scanner (System.in);
    
    public void calculateIva() {
    float price = 0.00F;
    float totalPrice = 0.00F;
    System.out.println("Enter the price of the product: ");
    price = sc.nextFloat();

    totalPrice = SalesTax.computeIva(price, 12);
    System.out.println("The original price is: " + String.format("%.2f", price));
    System.out.println("The total price including IVA is: " + String.format("%.2f", totalPrice));
}

public void calculateIce() {
    float price = 0.00F;
    float totalPrice = 0.02F;
    int typeOfGame;
    String type;

    System.out.println("Enter the price of the VideoGame: ");
    price = sc.nextFloat();
    totalPrice = SalesTax.computeIce(price, 30);
    System.out.println("The original price is: " + String.format("%.2f", price));
    System.out.println("The total price including ICE is: " + String.format("%.2f", totalPrice));
}

public void calculateIncomeTax() {
    float salary = 0.00F;
    float totalSalary = 0.00F;
    System.out.println("Enter your salary for the month: ");
    salary = sc.nextFloat();

    totalSalary = SalesTax.computeIncomeTax(salary);
    System.out.println("The original salary is: " + String.format("%.2f", salary));
    System.out.println("The total salary minus the Income Tax is: " + String.format("%.2f", totalSalary));
}

}
