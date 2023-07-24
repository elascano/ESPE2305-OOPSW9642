/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Divergence {
    public static int computeDivergence(int n){


        int suma = 0;

        for (int i = 1; i <= n; i++) {
            int numero = (i % 2 == 0) ? -i : i;
            suma += numero;
        }

        System.out.println(" Divergente: " + suma);
        return suma;
    }
}
