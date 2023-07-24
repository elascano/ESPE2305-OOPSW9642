/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.shoes.view;

import ec.espe.edu.shoes.model.TaxesManager;
import java.util.Scanner;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class Menu {
    TaxesManager taxesManager = new TaxesManager();
   
   
    public void showMenuTaxes(){
    
        int option;
        Scanner sc = new Scanner(System.in);

        do{
             System.out.println("Enter the Option for TypeCalculator: ");
             System.out.println("1.ComputeIVA: ");
             System.out.println("2.ComputeICE: ");
             System.out.println("3.ComputeIncomeTaxes: ");
             System.out.println("4.Exit...");
             
             option = sc.nextInt();
             switch (option)
             {
                 case 1: 
                     taxesManager.calculateIva();
                     break;
                
                 case 2: 
                     taxesManager.calculateIce();
                     break;
                 
                 case 3:
                     taxesManager.calculateIncomeTax();
                     break;
                     
                 default:
                     System.out.println("The option selected is incorrect...");
                     break;
             
             }
             
        
        }while(option<4);
    
    }
    
    
}
