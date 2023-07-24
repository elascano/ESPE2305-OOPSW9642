/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */

public class FactorialCalculator {

    public static int factorial(int n) {
        int producto = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return -1; // Puedes utilizar un valor negativo para indicar que no hay factorial
        } else {
            for (int i = 2; i <= n; i++) {
                producto *= i;
            }
            return producto;
        }
    }
}
