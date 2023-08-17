/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.passenger.controller;

/**
 *
 * @author LEONEL
 */
public class Bunises {
    double pasajes (double a, double b) {
        double pasajeMenores = a * 0.17;
        double pasajeAdultos = b * 0.35;
        double pasajeTotal = pasajeMenores + pasajeAdultos;
        return pasajeTotal;
    }
}
