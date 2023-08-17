package ec.edu.espe.shoes.view;

import com.codecrafters.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author Jeffrey Manobanda, Code Crafters, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage=12.0F;
        price=20.0F;
        float totalPrice;
        
        System.out.println("Jeffrey Manobanda Shoe Maker");
        totalPrice = SalesTax.computeIva(price,ivaPercentage);
        pairOfShoes = new PairOfShoes(1,"Venus","escolar",price);
        System.out.println("Pair Of Shoes 1 --" +pairOfShoes);
        
        pairOfShoes = new PairOfShoes(2,"buestan","casual",10);
        System.out.println("Pair Of Shoes 2 --" +pairOfShoes);
        
    }
    
}