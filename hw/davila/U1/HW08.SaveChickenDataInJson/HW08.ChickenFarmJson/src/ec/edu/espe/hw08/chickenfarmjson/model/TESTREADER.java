
package ec.edu.espe.hw08.chickenfarmjson.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class TESTREADER {
    public static void main(String[] args) {
        String fileName = "archivo.json";
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
    }
}

