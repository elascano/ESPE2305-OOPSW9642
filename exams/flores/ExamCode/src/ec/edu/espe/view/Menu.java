/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.JsonManager;
import ec.edu.espe.model.University;
import ec.edu.espe.controller.UniversityManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    University university;
    ArrayList<University> universities = new ArrayList<>();
    UniversityManager universityManager = new UniversityManager();

    public void menu() {
        int option;
        do{
            System.out.println("1.Enter university");
            System.out.println("2.Delete all universities");
            System.out.println("3.Close");
            option = scanner.nextInt();

                switch(option) {
                    case 1:
                        universityManager.registrateUniversity(universities);
                    break;
                    case 2:
                        universityManager.deleteUniversityList(universities);
                    break;
                    case 3: 
                        System.out.println("Leaving....");
                    break;
                }
        }while(option != 3);
    }
}