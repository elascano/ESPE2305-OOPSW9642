package espe.edu.ec.controller;

/**
 *
 * @author Andres Espin, The javas, DCOO-ESPE
 */
import espe.edu.ec.model.CSVFileHandler;
import espe.edu.ec.model.Triangle;
import espe.edu.ec.view.UserInterface;
import java.util.List;
import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        CSVFileHandler fileHandler = new CSVFileHandler("triangles.csv");
        
        while (true) {
            ui.showMenu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            
            switch (option) {
                case 1 -> {
                    Triangle triangle = ui.inputData();
                    fileHandler.writeData(triangle);
                    System.out.println("Area: " + triangle.calculateArea());
                    System.out.println("Perimetro: " + triangle.calculatePerimeter());
                }
                case 2 -> {
                    List<Triangle> triangles = fileHandler.readData();
                    for (Triangle t : triangles) {
                        System.out.println("Base: " + t.getBase() + ", Height: " + t.getHeight() + ", Side1: " + t.getSideOne()
                                + ", Side2: " + t.getSideTwo() + ", Side3: " + t.getSideThree()
                                + ", Área: " + t.calculateArea() + ", Perímetro: " + t.calculatePerimeter());
                    }
                }
                case 3 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}

