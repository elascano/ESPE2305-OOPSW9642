
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
                System.out.println("Este archivo ya existe");
            }
            else if(file.createNewFile()){
                System.out.println("Se creó correctamente el archivo");
            }
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al crear el archivo");
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
            System.out.println("Ocurrió un error al leer el archivo");
        }
    }
    
    public void write(String dataToWrite){
        try{
            FileWriter fileWriter = new FileWriter(fileName + ".csv");
            fileWriter.write(dataToWrite);
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al escribir en el archivo");
        }
        
    }
    public String dataToWrite(Sphere sphere){
        String data = new String();
        File file = new File (fileName + ".csv");
        
        if(file.exists()){
            data = dataToWriteIfFileExists(sphere);
            System.out.println("El archivo ha sido actualizado correctamente");
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
            System.out.println("Ocurrió un error al escribir en el archivo");
        }
    return data;
    }
}
