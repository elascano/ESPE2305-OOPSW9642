/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thefamse.series;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class DivergenceCalculator {
    public static int divergenceCalculator(int divergentNum) {
        int result = 1;
        int number = 1;

        if (divergentNum >= 2) {
            for (int i = 1; i <= divergentNum; i++) {
                number *= -i;
                result += number;
            }
        } else {
            result = divergentNum;
        }

        System.out.println("Divergent number: " + result);
        return result;
    }
}
