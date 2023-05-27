package ec.edu.espe.ohmsLaw.controller;

import ec.edu.espe.ohmsLaw.model.ohmVariables;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */

public class ohmController {

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("*******Options Menu********");
            System.out.println("1. Insert data");
            System.out.println("2. Read Data");
            System.out.println("3. Leave");
            System.out.print("Enter an opcion: ");

            //Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el búfer

            switch (option) {
                case 1:
                    addToCSV();
                    break;
                case 2:
                    reedFileCSV();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void addToCSV() {
        
        ohmVariables operation = new ohmVariables();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the current: ");
        int current = scanner.nextInt();
        operation.setCurrent(current);
        
        System.out.println("enter the resistence: ");
        int resistence = scanner.nextInt();
        operation.setResistence(resistence);

        System.out.println("enter the voltage: ");
        int voltage = current * resistence;
        operation.setVoltage(voltage);
        
        String datos = current + "," + resistence + "," + voltage;

        // Guardar los datos en un archivo CSV
        writeFileCSV(datos, "Voltage.csv");

        System.out.println("Datos guardados exitosamente.");
        
    }

    private void reedFileCSV() throws IOException {
        String file = "C:\\Users\\yeshu\\OneDrive\\Documentos Académicos\\OBJECTS_ORIENTED_PROMAMMING\\FIRST_PARCIAL\\HomeWorks\\ohmLaw\\Voltage.csv";
        BufferedReader reader = null;
        String line ="";
        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!= null){
                String[] row = line.split(",");
                for(String index : row) {
                    System.out.printf("%-20s", index);
                }
                System.out.println("");
            } 
        }
        catch(IOException e){
            e.printStackTrace();}
        finally {
            reader.close();
        }
    }

    private void writeFileCSV(String datos, String nombreArchivo) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(datos);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
