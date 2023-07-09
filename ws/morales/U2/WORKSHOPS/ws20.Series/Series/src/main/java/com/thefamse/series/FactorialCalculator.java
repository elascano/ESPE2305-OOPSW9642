/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thefamse.series;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class FactorialCalculator {
    static {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("El factorial de " + number + " es: " + factorial);
    }

    private static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
