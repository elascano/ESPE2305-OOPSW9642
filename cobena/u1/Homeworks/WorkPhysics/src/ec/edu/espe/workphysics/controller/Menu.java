package ec.edu.espe.workphysics.controller;

import ec.edu.espe.workphysics.model.CSVFile;
import ec.edu.espe.workphysics.model.WorkPhysicsFormula;
import java.util.Scanner;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Menu {
    CSVFile csvFile = new CSVFile();
    Scanner keyboardInput = new Scanner(System.in);
    WorkPhysicsFormula workFormula = new WorkPhysicsFormula();
    String dataToWrite1;
    int mainMenuValidation;
    int repMenuValidation;
    
    public void MainMenu() { 
        
        do{
            System.out.println("Work calculation and register app");
            System.out.println("------------------------------------------");
            System.out.println("1.- Calculate Work");
            System.out.println("2.- View Registered Data");
            System.out.println("3.- Exit");
            
            mainMenuValidation = keyboardInput.nextInt();
            csvFile.setFileName("WorkPhysicFormula");
                
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
        inputAppliedForce();
        inputDisplacement();
        workFormula.calculateWork();
        System.out.println("Work for the entered data= " + workFormula.getWork());
        csvFile.write(workFormula);
    }
    public void viewDataMenu() {
        csvFile.viewDataSaved();
    }
    
    public void inputAppliedForce(){
            System.out.println("Enter the applied force");
            workFormula.setAppliedForce(keyboardInput.nextDouble());
    }
    
    public void inputDisplacement(){
        do{
            System.out.println("Enter the displacement");
            workFormula.setDisplacement(keyboardInput.nextDouble());
            if(workFormula.getDisplacement()<0){
                System.out.println("Negative displacement doesnt exist");
            }
        }while(workFormula.getDisplacement()<0);
    }
}
