/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.ICE;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Drink {
    public static double calculateAlcoholTax(double litersOfAlcohol) {
        double alcoholRate = 7.15;
        return alcoholRate * litersOfAlcohol;
    }

    public static double calculateAlcoholicBeveragesTax(double litersOfAlcohol) {
        double alcoholicBeveragesRate = 7.18;
        return alcoholicBeveragesRate * litersOfAlcohol;
    }

    public static double calculateCraftBeerTax(double litersOfAlcohol) {
        double craftBeerRate = 1.49;
        return craftBeerRate * litersOfAlcohol;
    }

    public static double calculateSmallScaleIndustrialBeerTax(double litersOfAlcohol) {
        double smallScaleIndustrialBeerRate = 8.41;
        return smallScaleIndustrialBeerRate * litersOfAlcohol;
    }

    public static double calculateMediumScaleIndustrialBeerTax(double litersOfAlcohol) {
        double mediumScaleIndustrialBeerRate = 10.48;
        return mediumScaleIndustrialBeerRate * litersOfAlcohol;
    }

    public static double calculateLargeScaleIndustrialBeerTax(double litersOfAlcohol) {
        double largeScaleIndustrialBeerRate = 13.08;
        return largeScaleIndustrialBeerRate * litersOfAlcohol;
    }

    public static double calculateNonAlcoholicBeveragesTax(double gramsOfSugar) {
        double sugarThreshold = 25.0;
        double taxRate = 0.18;

        if (gramsOfSugar > sugarThreshold) {
            return taxRate * (gramsOfSugar / 100);
        } else {
            return 0.0;
        }
    }
}

