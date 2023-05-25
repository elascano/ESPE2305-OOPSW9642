package ec.edu.espe.ohmsLaw.controller;

import ec.edu.espe.ohmsLaw.model.ohmVariables;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class addToCSV {
    public void addToCSV() {
        ohmVariables operation = new ohmVariables();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current: ");
        int current = scanner.nextInt();
        operation.setCurrent(current);

        System.out.println("Enter the resistance: ");
        int resistance = scanner.nextInt();
        operation.setResistence(resistance);

        System.out.println("Calculating the voltage...");
        int voltage = current * resistance;
        operation.setVoltage(voltage);

        String data = current + "," + resistance + "," + voltage;

        // Guardar los datos en un archivo CSV
        writeFileCSV writer = new writeFileCSV();
        writer.writeFileCSV(data, "Voltage.csv");

        System.out.println("Data saved successfully.");
    }
}
