
package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters, DCCO-ESPE
 */
public class JsonFile {
    
    public static void editFile(String fileName, Chicken chicken) {
        File file = new File(fileName);
        
        try {
            //PrintWriter output = new PrintWriter(new FileWriter(file,true));
            FileWriter output = new FileWriter(fileName);
            Gson gson = new Gson();
            
            String chickenJson = gson.toJson(chicken);
            output.write(chickenJson);
            
            output.close();
            //System.out.println("\n\n..:: File has been written! ::..\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void searchChicken(String fileName,int id) {
        File file = new File(fileName);
        String[] data;
        String idToString=id+"";
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            while (line != null) {
                data = line.split(";");
                
                if (idToString.equals(data[0])) {
                    printLine(data);
                    System.out.println();
                }
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readFile(String fileName){
        File file = new File(fileName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            while (line != null) {
                data = line.split(";");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void printLine(String[] data) {        
        //for-each use
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact="Yes";
            }else if("false".equals(fact)){
                fact="No";
            }
            System.out.print(fact + "\t|");
        }
    }
    
    public static void loadFile(String fileToLoadName) {
        File fileToLoad = new File(fileToLoadName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(fileToLoad));
            var line = input.readLine();
            var fileName = "chickens.json";
            boolean molting=false;
            while (line != null) {
                Chicken chicken;
                
                data = line.split(";");
                if("true".equals(data[4])){
                    molting=true;
                }else if("false".equals(data[4])){
                    molting=false;
                }
                chicken = new Chicken(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), molting);
                editFile(fileName, chicken);
                line = input.readLine();
            }
            input.close();
            System.out.println("\n FILE ADDED \n");
        } catch (FileNotFoundException ex) {
            System.out.println("\n FILE DOESN'T EXIST \n");
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            System.out.println("\n \n");
            ex.printStackTrace(System.out);
        }
    }
    
}

