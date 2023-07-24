/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.shoes.view;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class IncomeTax {
    public static double calculateTaxRenta(double monthlysalary) {
        double ingresoNeto = monthlysalary * 12;
        double taxbase = ingresoNeto;
        double impuestoRenta;

        if (taxbase <= 11722) {
            impuestoRenta = 0;
        } else if (taxbase <= 14935) {
            impuestoRenta = (taxbase - 11722) * 0.05;
        } else if (taxbase <= 18666) {
            impuestoRenta = (taxbase - 14935) * 0.1 + 161;
        } else if (taxbase <= 22418) {
            impuestoRenta = (taxbase - 18666) * 0.12 + 534;
        } else if (taxbase <= 32783) {
            impuestoRenta = (taxbase - 22418) * 0.15 + 984;
        } else if (taxbase <= 43147) {
            impuestoRenta = (taxbase - 32783) * 0.2 + 2539;
        } else if (taxbase <= 53512) {
            impuestoRenta = (taxbase - 43147) * 0.25 + 4612;
        } else if (taxbase <= 63876) {
            impuestoRenta = (taxbase - 53512) * 0.3 + 7203;
        } else if (taxbase <= 103644) {
            impuestoRenta = (taxbase - 63876) * 0.3 + 10312;
        } else {
            impuestoRenta = (taxbase - 103644) * 0.35 + 24231;
        }

        return impuestoRenta;
    }
}

