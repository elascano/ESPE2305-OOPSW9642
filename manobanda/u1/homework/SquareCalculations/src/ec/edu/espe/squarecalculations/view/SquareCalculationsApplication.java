
package ec.edu.espe.squarecalculations.view;

import ec.edu.espe.squarecalculations.model.Square;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jeffrey Manobanda, Codecrafters Team, DCCO-ESPE
 */
public class SquareCalculationsApplication {
    
    public static void main(String[] args) {

        int choice;
        int Line = 1;
        Square squares[] = new Square[100];
        for (int i = 0; i < 100; i++) {
            squares[i] = new Square();
        }
        
        Scanner option = new Scanner(System.in);
        
        do {
            System.out.println("Choose one of the options");
            System.out.println("1.- Calculate Area");
            System.out.println("2.- Calculate the perimeter");
            System.out.println("3.- Read the file");
            System.out.println("4.Exit");

            choice = option.nextInt();

            switch (choice) {
                case 1 -> {
                    dataregister(squares[Line], option);
                    System.out.println("Area: " );
                    Line++;
                }
                case 2 -> {
                    dataregister(squares[Line], option);
                    System.out.println("Perimetro: " );
                    Line++;
                }

                case 3 -> {
                    dataoutput(squares[Line]);
                    
                    Line++;;
                }
                case 4 -> {
                    System.out.println("Thanks, come back soon");
                    
                }

            }

        } while (choice != 4);
    }
    private static void dataoutput(Square squares) {
        System.out.println(" ---Base--->" + squares.getbase());
        System.out.println(" ---Height--->" + squares.getheight());
        System.out.println(" ---Side--->" + squares.getside());
        System.out.println(" ---Perimeter--->" + squares.perimeter());
        System.out.println(" ---Area--->" + squares.area());
    }

    private static void menu(int choice) {
        while (choice < 1 || choice > 3) {
            Scanner option = new Scanner(System.in);
            System.out.println("Invalid option");
            choice = option.nextInt();
        }
    }

    private static void calcualtionsFile(Square squares) {
        File calculationsFile = new File("Calculations.csv");
        double squareBase = squares.getbase();
        double squareHeight = squares.getheight();
        double squareSide = squares.getside();
        double squarePerimeter = squares.perimeter();
        double squareArea = squares.area();

        try {

            try ( PrintWriter writer = new PrintWriter(new FileWriter(calculationsFile, true))) {
                writer.println("");
                writer.print(squareBase + "," + squareHeight + "," + squareSide + "," + squarePerimeter + "," + squareArea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static void dataregister(Square squares, Scanner option) {
        System.out.println("Enter the measurement of the base\t");
        squares.setbase(option.nextDouble());
   
        System.out.println("Enter the height measurement\t");
        squares.setheight(option.nextDouble());

        System.out.println("Enter the measurement of one side\t");
        squares.setside(option.nextDouble());
    }

}

