
package ec.edu.espe.spherevolumecalculation.model;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */

public class CSVFile {
    private String fileName;
    private int order;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void create() {
        try {
            File file = new File (fileName + ".csv");
            
            if(file.exists()){
                
            }
            else if(file.createNewFile()){
                System.out.println("The file was created correctly");
            }
        }
        catch(IOException e){
            System.out.println("There was an error creating the file");
        }  
    }
    
    public void write(Sphere sphere){
        File file = new File(fileName + ".csv");
        if(file.exists()){
            determinateLastOrder();
            order++;
            writeIfFileExists(sphere);
        }
        else{
            order = 1;
            writeIfFileDoesNotExists(sphere);
        }
    }
    
    public void writeIfFileDoesNotExists(Sphere sphere){
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv"));){
            fileWriter.write("Order,Radius,Volume\n" + String.valueOf(order) 
                    + "," + sphere.toString()+" \n");
            fileWriter.flush();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
        
    }
    
    public void writeIfFileExists(Sphere sphere){
        
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv", true));){
            fileWriter.write(String.valueOf(order) + "," +sphere.toString());
            fileWriter.newLine();
            fileWriter.flush();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
    }
    
    public void determinateLastOrder(){
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName + ".csv"));){
            String line = new String();
            String splittedLineContent[] = new String[3];
            
            line = fileReader.readLine(); //Header read to evitate incovenients in the parseInt
            while (line != null) {
                line = fileReader.readLine();
                
                if (line == null) {
                    break;
                }
                
                split(",", line, splittedLineContent);
                
                order = Integer.parseInt(splittedLineContent[0]);
            }
        }
        catch(IOException e){
            System.out.println("There was an error reading the file");
        }
    }
    
    public void viewDataSaved(){
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName + ".csv"));){
            String line = new String();
            String splittedLineContent[] = new String[3];
            
            line = fileReader.readLine(); //Lectura del encabezado para evitar la interferencia luego
            while (line != null) {
                line = fileReader.readLine();
                
                if (line == null) {
                    break;
                }
                
                split(",", line, splittedLineContent);
                printMessageOfDataSaved(splittedLineContent);
            }
        }
        catch(IOException e){
            System.out.println("There was an error reading the file");
        }
    }
    
    public void printMessageOfDataSaved(String[] partsOfText){
        double sphereRadius;
        double sphereVolume;
        
        order = Integer.parseInt(partsOfText[0]);
        sphereRadius = Double.parseDouble(partsOfText[1]);
        sphereVolume = Double.parseDouble(partsOfText[2]);
        
        System.out.println("Sphere " + order + " with radius: " + sphereRadius 
                        + " [u] has volume of: " + sphereVolume + " [u^3]");
    
    }
    
    public void split(String delimitator, String text, String[] partsOfText){
        String[] split = text.split(",");
        int i=0;
        for(String splittedText : split){
            partsOfText[i] = splittedText;
            i++;
        }
    }
}

