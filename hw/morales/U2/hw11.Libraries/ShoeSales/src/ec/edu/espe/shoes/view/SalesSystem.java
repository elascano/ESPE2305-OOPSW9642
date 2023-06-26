package ec.edu.espe.shoes.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class SalesSystem {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean out = false;
        int option;
        
        while(!out){
            System.out.println("\tTax Calculator - Anthony Morales");
            System.out.println("1. Calculate Iva Shoes");
            System.out.println("2. Calculate Ice Cigar");
            System.out.println("3. Calculate Income Tax");
            System.out.println("4. Out");
            
            try{
                System.out.println("Enter your choise:");
                option = scanner.nextInt();

                switch(option){
                    case 1:
                          ShoesSalesSystem.calculateShoes();
                       break;
                    case 2:
                          CigarSalesSystem.calculateIce();
                       break;
                    case 3:
                          NaturalPersonTax.calculateNaturalPerson();
                       break;
                    case 4:
                        out = true;
                       break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            
            }catch(InputMismatchException e){
                System.out.println("Enter only Numbers.");
                scanner.next();
            }
        }
        System.out.println("End of the Menu.");
    }
}
