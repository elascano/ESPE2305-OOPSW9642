
package ec.espe.edu.shoes.view;

import com.softwarejuniors.tax.SalesTax;
import ec.espe.edu.shoes.model.PairOfShoes;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        price = 20.0F;
        float totalPrice;
        float ivaPercentage=12.0F;
        totalPrice = SalesTax.computeIva(price,ivaPercentage);
        
        
        pairOfShoes = new PairOfShoes(1,"Venus","Si",20.0F,totalPrice);
        System.out.println("Pair of Shoes: ---->"+pairOfShoes);
        pairOfShoes = new PairOfShoes(1,"Venus","Si",20.0F,0.0F);
        System.out.println("Pair of Shoes: ---->"+pairOfShoes);
            price = 10.0F;
        pairOfShoes = new PairOfShoes(1,"Venus","Si",price);
        System.out.println("Pair of Shoes: ---->"+pairOfShoes);
    }
    
}
