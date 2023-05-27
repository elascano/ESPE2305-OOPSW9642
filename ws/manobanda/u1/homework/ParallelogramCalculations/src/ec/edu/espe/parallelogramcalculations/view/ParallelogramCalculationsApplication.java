
package ec.edu.espe.parallelogramcalculations.view;

import ec.edu.espe.parallelogramcalculations.model.Parallelogram;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jeffrey Manobanda, Codecrafters Team, DCCO-ESPE
 */
public class ParallelogramCalculationsApplication {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int option;
        List<Parallelogram> squaresList = new ArrayList<>();
        Parallelogram squares = new Parallelogram();
        do {
            System.out.println("Choose one of the options");
            System.out.println("1.- Calculate the area of ​​the parallelogram");
            System.out.println("2.- Calculate the perimeter of ​​the parallelogram");
            System.out.println("3.- Read the file");
            System.out.println("4.Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    squares.dataregister();
                    squaresList.add(squares);
                    if (squaresList.isEmpty()) {
                        System.out.println("There is no data entered");
                    } else {
                        for (Parallelogram point : squaresList) {
                            double area = Parallelogram.CalArea(point.getBase(), point.getHeight(), point.getSide());
                            point.setArea(area);
                            System.out.println("The area of ​​base " + point.getBase() + " and height " + point.getHeight() + " is: " + area);
                        }
                    }
                    break;
                case 2:
                    squares.dataregister();
                    squaresList.add(squares);
                    if (squaresList.isEmpty()) {
                        System.out.println("There is no data entered");
                    } else {
                        for (Parallelogram point : squaresList) {
                            double perimeter = Parallelogram.CalPerimeter(point.getBase(), point.getHeight(), point.getSide());
                            point.setArea(perimeter);
                            System.out.println("The perimeter of ​​base " + point.getBase() + " and side " + point.getSide() + " is: " + perimeter);
                        }
                    }
                    break;
                case 3:
                    
                    if (squaresList.isEmpty()) {
                        System.out.println("There is no data entered");
                    } else {
                        String filename = "Calculations.csv";
                        FileCS(squaresList, filename);
                        for (Parallelogram point : squaresList) {
                            double area = Parallelogram.CalArea(point.getBase(), point.getHeight(), point.getSide());
                            point.setArea(area);
                            System.out.println("The area of ​​base " + point.getBase() + " and height " + point.getHeight() + " is: " + area);
                            double perimeter = Parallelogram.CalPerimeter(point.getBase(), point.getHeight(), point.getSide());
                            point.setArea(perimeter);
                            System.out.println("The perimeter of ​​base " + point.getBase() + " and side " + point.getSide() + " is: " + perimeter);
                        }
                    }
                    break;
                case 4:
                     System.out.println("Thank you for using the program, come back soon");
            }
        } while (option != 4);
    }

    private static void menu(int choice) {
        while (choice < 1 || choice > 4) {
            Scanner option = new Scanner(System.in);
            System.out.println("Invalid option");
            choice = option.nextInt();
        }
    }
    
    public static void FileCS(List<Parallelogram> squaresList, String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
      writer.append("Base,Height,Area,Perimeter\n");
      
      for (Parallelogram squares : squaresList) {
        double squareBase = squares.getBase();
        double squareHeight = squares.getHeight();
        double squareSide = squares.getSide();
        double squarePerimeter = squares.getPerimeter();
        double squareArea = squares.getArea();
        
        writer.append(String.valueOf(squareBase)).append(",")
              .append(String.valueOf(squareHeight)).append(",")
              .append(String.valueOf(squareSide)).append(",")
              .append(String.valueOf(squareArea)).append(",")
              .append(String.valueOf(squarePerimeter)).append("\n");
      }
      
      writer.flush();
      System.out.println();
    } catch (IOException e) {
      System.out.println();
    }
  }
   
    

}

