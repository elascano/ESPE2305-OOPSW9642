
package com.jsons.videogames.view;

import com.jsons.tax.SalesTax;
import com.jsons.videogames.model.Videogame;
import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class VideogamesSystem {
    
    public static void main(String[] args) {
        Videogame videogame;
        int id;
        String name;
        String companny;
        float price;
        float ice;
        float productionCost;
        
        System.out.println("Welcome to my Videogame ICE Calculator System");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the Videogame´s ID: ");
        id = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Please enter the Videogame´s Name:");
        name = scanner.nextLine();
        
        System.out.println("Please enter the Videogame´s Companny:");
        companny = scanner.nextLine();
        
        System.out.println("Please enter the Videogame´s Price:");
        price = scanner.nextFloat();
        
        ice = SalesTax.computeIce(price);
        
        
        
    }
    
    
}
