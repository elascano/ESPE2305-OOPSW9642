
package ec.edu.espe.formula.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class reedFileCSV {
 public void reedFileCSV() throws IOException {
        String file = "C:\\Users\\Usuario\\Documents\\ESPE\\1_2_3 level\\OOP_9642\\NETBEANS\\CSVFormula\\Excel.csv";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-20s", index);
                }
                System.out.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}    

