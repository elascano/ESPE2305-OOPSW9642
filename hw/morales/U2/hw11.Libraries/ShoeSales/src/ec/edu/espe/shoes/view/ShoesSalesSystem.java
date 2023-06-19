package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.ShoesController;
import ec.edu.espe.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class ShoesSalesSystem {
    public static void calculateShoes() {
        Scanner entrada = new Scanner(System.in);
        ShoesController pairOfShoes;
        String brand;
        String model;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        float totalPrice;
        
        System.out.println("<----------------------------------------->");
        System.out.println("\t Morales Anthony Market Shoes");
        System.out.println("Enter the Brand:");
        brand = entrada.nextLine();
        System.out.println("Enter the Model:");
        model = entrada.nextLine();
        System.out.println("Enter Price:");
        price = entrada.nextFloat();
        System.out.println("<----------------------------------------->");
        
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        pairOfShoes = new ShoesController(1, "Venus", "Escolar", 20, totalPrice);
        System.out.println("pair of shoes -->" +pairOfShoes);
        
        pairOfShoes = new ShoesController(2, "Venus", "Escolar", 20.0F ,0.0F);
        System.out.println("pair of shoes -->" + pairOfShoes);
        
        pairOfShoes = new ShoesController(3, "Buestan", "Casual", price);
        System.out.println("pair of shoes -->" + pairOfShoes);
        
        pairOfShoes = new ShoesController(4, brand, model, price);
        System.out.println("pair of shoes -->" +pairOfShoes);
    }
}
