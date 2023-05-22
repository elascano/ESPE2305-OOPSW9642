
package ec.edu.espe.spherevolumecalculation.model;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */

public class CSVFile {
    private String fileName;
    private int fileLines=0;

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
    
    public void read(){
        String dataReaded = new String();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName + ".csv"));
            String line = new String(); 
            while (line != null) {
		System.out.println(line);
		line = fileReader.readLine();
            }
            fileReader.close();
        }
        catch(IOException e){
            System.out.println("There was an error reading the file");
        }
    }
    
    public void write(String dataToWrite){
        try{
            FileWriter fileWriter = new FileWriter(fileName + ".csv");
            fileWriter.write(dataToWrite);
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
        
    }
    public String dataToWrite(Sphere sphere){
        String data = new String();
        File file = new File (fileName + ".csv");
        
        if(file.exists()){
            data = dataToWriteIfFileExists(sphere);
            System.out.println("The file has been updated correctly");
        }
        else{
            data = dataToWriteIfFileDoesntExists(sphere);
        }
        return data;
    }
    
    public String dataToWriteIfFileDoesntExists(Sphere sphere){
        String data = new String();
        String sphereData = new String();
        fileLines = 1;
        sphereData = (String.valueOf(fileLines) + "," + sphere.toString());
        data= ("Order,Radius,Volume");
        data = (data + "\n" + sphereData);
        return data;
    }
    public String dataToWriteIfFileExists(Sphere sphere){
        fileLines = 0;
        String data = new String();
        String sphereData = new String();
        File file = new File (fileName + ".csv");
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                fileLines++;
                data = (data + "\n" + fileScanner.next());
            }
            sphereData = (String.valueOf(fileLines) + "," + sphere.toString());
            data = (data + "\n" + sphereData);
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
    return data;
    }
}
