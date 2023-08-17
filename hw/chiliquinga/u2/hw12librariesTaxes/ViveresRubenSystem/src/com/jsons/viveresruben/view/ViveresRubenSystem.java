package com.jsons.viveresruben.view;

import com.jsons.viveresruben.model.Product;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class ViveresRubenSystem {
    public static void main(String[] args) {
        String type = "videojuego 'GTA V' ";
        int id = 0;
        float price = 50;
        float icePercentage = 0.35F;
        Product product = new Product(type, 0, price, icePercentage);
        System.out.println(product);
    }
}
