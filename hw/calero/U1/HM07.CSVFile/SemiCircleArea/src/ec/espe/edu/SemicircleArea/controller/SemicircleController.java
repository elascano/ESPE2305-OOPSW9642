
package ec.espe.edu.SemicircleArea.controller;
import ec.espe.edu.SemicircleArea.model.CalculateSemicircleArea;
import ec.espe.edu.SemicircleArea.view.InterfaceUser;
/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SemicircleController {
    private CalculateSemicircleArea model;
    private InterfaceUser view;
    private static final String ARCHIVO_CSV = "results.csv";

    public SemicircleController() {
        model = new CalculateSemicircleArea();
        view = new InterfaceUser();
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            int option = view.displayMenuAndGetOption();

            switch (option) {
                case 1 -> calculateAreaAndSaveToCSV();
                case 2 -> readCSVFile();
                case 3 -> {
                    exit = true;
                    view.displayFarewellMessage();
                }
                default -> view.displayInvalidOption();
            }
        }
    }

    private void calculateAreaAndSaveToCSV() {
        double radius = view.getRadiusFromUser();
        model.setRadius(radius);
        model.calculateArea();
        double area = model.getArea();
        view.displayArea(area);
        saveResultToCSV(radius, area);
    }

    private void saveResultToCSV(double radius, double area) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CSV, true))) {
            writer.println(radius + "," + area);
            System.out.println("Result saved in: " + ARCHIVO_CSV);
        } catch (IOException e) {
            System.out.println("Error saving result to file " + ARCHIVO_CSV);
        }
    }

    private void readCSVFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CSV))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + ARCHIVO_CSV);
        }
    }
}
