
package ec.edu.espe.shoes.view;

import com.codewarriors.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        float icePercentage;
        ivaPercentage = 12.0f;
        icePercentage = 5.0f;
        price = 20.0f;
        float totalPrice;
        float monthlyIncome = 0.0f;
        boolean validInput = false;
        
        System.out.println("Leonel Tipan shoe maker");
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println("pair of shoes --> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0f, 22.40f);
        System.out.println("pair of shoes --> " + pairOfShoes);

        try (Scanner scanner = new Scanner(System.in)) {
            while (!validInput) {
                try {
                    System.out.print("Enter monthly income: ");
                    monthlyIncome = scanner.nextFloat();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                }
            }
        }
        
        float annualIncomeTax = SalesTax.computeAnnualIncomeTax(monthlyIncome);
        System.out.println("Annual Income Tax: " + annualIncomeTax);
        
        float iceValue = SalesTax.computeIce(price, icePercentage);
        System.out.println("ICE Value: " + iceValue);
    }
}
