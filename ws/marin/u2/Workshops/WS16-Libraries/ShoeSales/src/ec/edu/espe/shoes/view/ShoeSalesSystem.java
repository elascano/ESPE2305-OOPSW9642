
package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.PairOfShoes;
import com.codecrafters.tax.sales.Iva;

public class ShoeSalesSystem {
     public static void main(String[] args) {
         PairOfShoes pairOfShoes ;
         float price;
         float ivaPercentage;
         ivaPercentage=12.0F;
         price =20.0F;
         float totalPrice;
         System.out.println("Josue Marin shoe maker"); 
         totalPrice=Iva.compute(price,ivaPercentage);
         pairOfShoes=new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
         System.out.println("Pair of shoes-->"+pairOfShoes);
         
         pairOfShoes=new PairOfShoes(1, "Venus","escolar", 20.0F,0);
         System.out.println("pair of shoes-->"+pairOfShoes);
         price=10.10F;
         pairOfShoes=new PairOfShoes(1, "Buestan", "casul", price, totalPrice);
         System.out.println("Pair of shoes-->"+pairOfShoes); 
     }     
}
