/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.codecrafters.income.view;

import com.codecrafters.income.controller.PersonTax;
import java.util.Scanner;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class Inomce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Enter your monthly salary: ");
        double wage = scanner.nextDouble();
        PersonTax tax; 
        tax = new PersonTax(wage);
         System.out.println("El IRS es: " + tax);
        

    }

}
