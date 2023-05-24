
package ec.edu.espe.workphysics.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
    
    public void write(WorkPhysicsFormula workFormula){
        File file = new File(fileName + ".csv");
        if(file.exists()){
            determinateLastOrder();
            order++;
            writeIfFileExists(workFormula);
        }
        else{
            order = 1;
            writeIfFileDoesNotExists(workFormula);
        }
    }
    
    public void writeIfFileDoesNotExists(WorkPhysicsFormula workFormula){
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv"));){
            fileWriter.write("Order,ForceApplicated,Displacement,Work\n" + String.valueOf(order) 
                    + "," + workFormula.toString()+" \n");
            fileWriter.flush();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
        
    }
    
    public void writeIfFileExists(WorkPhysicsFormula workFormula){
        
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv", true));){
            fileWriter.write(String.valueOf(order) + "," +workFormula.toString());
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
            String splittedLineContent[] = new String[4];
            
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
        File file = new File(fileName + ".csv");
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName + ".csv"));){
            String line = new String();
            String splittedLineContent[] = new String[4];
            
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
        double savedForceAplicatted;
        double savedDisplacement;
        double savedWork;
        
        order = Integer.parseInt(partsOfText[0]);
        savedForceAplicatted = Double.parseDouble(partsOfText[1]);
        savedDisplacement = Double.parseDouble(partsOfText[2]);
        savedWork = Double.parseDouble(partsOfText[3]);
                
        System.out.println("The work " + order + " when the applied force was: " 
                + savedForceAplicatted + " [force unities] and make the object displace " + 
                savedDisplacement + " [displacement unities] was: " + savedWork + "[work unities] \n");
    
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
