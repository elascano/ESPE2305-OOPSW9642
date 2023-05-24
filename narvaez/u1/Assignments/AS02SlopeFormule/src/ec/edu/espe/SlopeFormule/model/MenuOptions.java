package ec.edu.espe.SlopeFormule.model;

import ec.edu.espe.SlopeFormule.view.CreateCSV;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class MenuOptions {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        List<CoordinatesAxis> coordinatesList = new ArrayList<>();

        do {
            System.out.println("Menu options: ");
            System.out.println("1. Slope Calculator.");
            System.out.println("2. View calculated slope.");
            System.out.println("3. Create CSV.");
            System.out.println("4. Exit.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    CoordinatesAxis coordinates = new CoordinatesAxis();
                    coordinates.scanData();
                    coordinatesList.add(coordinates);
                    break;
                case 2:
                    if (coordinatesList.isEmpty()) {
                        System.out.println("The coordinates doesn't exist.");
                    } else {
                        for (CoordinatesAxis point : coordinatesList) {
                            float slope = SlopeCalculator.calculateSlope(point.getX1Axis(), point.getX2Axis(), point.getY1Axis(), point.getY2Axis());
                            point.setSlope(slope);
                            System.out.println("The slope between the points (" + point.getX1Axis() + ", " + point.getY1Axis() + ") and (" + point.getX2Axis() + ", " + point.getY2Axis() + ") is: " + slope);
                        }
                    }
                    break;
                case 3:
                     if (coordinatesList.isEmpty()) {
                        System.out.println("The coordinates doesn't exist.");
                        } else {
                         String filename = "Calculated_Slope.csv";
                         CreateCSV.generateCSV(coordinatesList, filename);
                         }
                    break;
            }
        } while (option != 4);
    }
}
