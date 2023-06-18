
package ec.edu.espe.view;

import ec.edu.espe.model.PairOfShoes;
import ec.edu.espe.tax.iva;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        float ivaPercentage = 12.0F;
        float price = 20.37F;
        float totalPrice = iva.compute(price, ivaPercentage);
        
        System.out.println("Shoe maker Leonardo Narvaez");
        
        PairOfShoes pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println(pairOfShoes);
        
        price = 20.0F;
        pairOfShoes = new PairOfShoes(2, "Nike", "Deportivo", price, 0.0F);
        System.out.println(pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(3, "Rebook", "Deportivo", price);
        System.out.println(pairOfShoes);
        
        
        
    }
}
