package ec.edu.espe.shoes.view;

import com.codewarriors.tax.sales.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPrecentage;
        ivaPrecentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("Edison Verdesoto Shoe maker");
        totalPrice = SalesTax.computeIva(price, ivaPrecentage);
        
        pairOfShoes = new PairOfShoes(1, "venus", "Escolar", price , totalPrice);
        System.out.println("pair of shoes --->" + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(2, "venus", "Escolar", 20.0F ,0.0F);
        System.out.println("pair of shoes --->" + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(3, "Buestan", "Casual", price);
        System.out.println("pair of shoes --->" + pairOfShoes);
    }
}
