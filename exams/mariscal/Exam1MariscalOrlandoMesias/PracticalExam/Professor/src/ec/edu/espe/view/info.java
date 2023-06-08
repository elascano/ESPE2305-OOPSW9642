

package ec.edu.espe.view;

import ec.edu.espe.mode.info;
import java.util.Scanner;


/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.mode;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of data entries: ");
        int numberOfEntries = scanner.nextInt();
        
        String[][] data = new String[numberOfEntries][3];
        
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Enter ID: ");
            data[i][0] = scanner.next();
            
            System.out.println("Enter name: ");
            data[i][1] = scanner.next();
            
            System.out.println("Enter subject: ");
            data[i][2] = scanner.next();
        }

        for (String[] entry : data) {
            System.out.println("ID: " + entry[0]);
            System.out.println("Name: " + entry[1]);
            System.out.println("Subject: " + entry[2]);
            System.out.println("--------------------");
        }
    }
}
