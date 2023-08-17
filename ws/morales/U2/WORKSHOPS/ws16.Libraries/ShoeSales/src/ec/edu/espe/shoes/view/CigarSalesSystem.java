package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.ProductController;
import ec.edu.espe.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class CigarSalesSystem {
        public static void calculateIce(){
        Scanner entrada = new Scanner(System.in);
        ProductController packageOfCigar;
        String brand;
        float pack;
        float cigarette;
        float icePercentage;
        icePercentage = 16.0F;
        float totalPrice;
        
        System.out.println("<----------------------------------------------->");
        System.out.println("\t Morales Anthony Market Cigar");
        System.out.println("Enter the Brand:");
        brand = entrada.nextLine();
        System.out.println("Enter the Total Packs per Pack:");
        pack = entrada.nextFloat();
        System.out.println("Enter the Number of Cigarettes per Pack:");
        cigarette = entrada.nextFloat();
        System.out.println("<----------------------------------------------->");
        
        totalPrice = SalesTax.computeIce(pack, cigarette, icePercentage);
        
        packageOfCigar = new ProductController(1, brand, pack, cigarette, totalPrice);
        System.out.println("pack of cigar -->" +packageOfCigar);
    }
}
