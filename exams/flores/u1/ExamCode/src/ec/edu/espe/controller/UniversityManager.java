/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.JsonManager;
import ec.edu.espe.model.University;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class UniversityManager {
    University university;
    Scanner scanner = new Scanner(System.in);
    JsonManager jsonManager = new JsonManager();
    
    public void registrateUniversity(ArrayList<University> universities) {
        int id;
        String name, location;
        System.out.println("Enter university id: ");
        id = scanner.nextInt();
        System.out.println("Enter university name: ");
        name = scanner.next();
        System.out.println("Enter university location: ");
        location = scanner.next();
        
        university = new University(id, name, location);
        universities.add(university);
        jsonManager.createJson(universities);
        System.out.println("University registrated correctly");
    }
    
    public void deleteUniversityList(ArrayList<University> universities) {
        universities.clear();
        System.out.println("All universities deleted correctly");
        jsonManager.createJson(universities);
    }
    
}
