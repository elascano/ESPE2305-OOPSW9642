package ec.edu.espe.spherevolumecalculation.controller;

import ec.edu.espe.spherevolumecalculation.model.CSVFile;
import ec.edu.espe.spherevolumecalculation.model.Sphere;
import java.util.Scanner;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class MenuController {
    CSVFile csvFile = new CSVFile();
    Scanner keyboardInput = new Scanner(System.in);
    Sphere sphere = new Sphere();
    String dataToWrite1;
    int mainMenuValidation = 0;
    int repMenuValidation = 0;
    
    public void MainMenu() { 
        
        do{
            System.out.println("Sphere Volume Calculation and Register App");
            System.out.println("------------------------------------------");
            System.out.println("1.- Calculate Volume");
            System.out.println("2.- View Registered Data");
            System.out.println("3.- Exit");
            
            mainMenuValidation = keyboardInput.nextInt();
                
        switch(mainMenuValidation){
                case 1:
                    calculateAndRegisterMenu();
                    break;
                case 2:
                    viewDataMenu();
                    break;
            }
        }while(mainMenuValidation!=3);
    }
    
    public void calculateAndRegisterMenu() {
        inputAndValidateSphereRadius();
        sphere.setVolume(sphere.calculateVolume());
        csvFile.setFileName("SphereVolumeCalculation");
        dataToWrite1 = csvFile.dataToWrite(sphere);
        csvFile.create();
        csvFile.write(dataToWrite1);
    }
    public void viewDataMenu() {
        csvFile.read();
    }
    
    public void inputAndValidateSphereRadius(){
        do{
            System.out.println("Enter the sphere radius, pls");
            sphere.setRadius(keyboardInput.nextDouble());
            if(sphere.getRadius()<0){
                System.out.println("Negative radius doesnt exist");
            }
        }while(sphere.getRadius()<0);
    }
}
