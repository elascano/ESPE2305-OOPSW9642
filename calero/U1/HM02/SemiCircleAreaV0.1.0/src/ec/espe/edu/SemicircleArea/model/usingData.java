
package ec.espe.edu.SemicircleArea.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class usingData {
    
    private final String ARCHIVO_CSV = "results.csv"; 

    public void saveResultCSV(CalculateSemicircleArea calculateSemicircleArea) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CSV,true))) {
            writer.println(calculateSemicircleArea.getRadius());
            
            System.out.println("Result saved in: " + ARCHIVO_CSV);
            
        } catch (IOException e) {
            System.out.println("Error saving result to file " + ARCHIVO_CSV);
        }
    }
    
    
    public void readFileCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CSV))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + ARCHIVO_CSV);
        }
    }
}

