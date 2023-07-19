
package com.jsons.shoes.view;

import com.jsons.shoes.model.Shoe;
import com.jsons.tax.SalesTax;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class ShoeSalesSystem {
    
    public static void main(String[] args) {
        Shoe pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.0F;
        float totalPrice;
        
        System.out.println("Adonny Calero shoe maker");
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        pairOfShoes = new Shoe(1, "Venus", "Escolar",price,totalPrice);
        System.out.println("pair of shoes -->" + pairOfShoes);
        
        pairOfShoes = new Shoe(1, "Venus", "Escolar",20.0F,0);
        System.out.println("pair of shoes -->" + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new Shoe(1, "Buestan", "Casual",price);
        System.out.println("pair of shoes -->" + pairOfShoes);
    }
    
}
