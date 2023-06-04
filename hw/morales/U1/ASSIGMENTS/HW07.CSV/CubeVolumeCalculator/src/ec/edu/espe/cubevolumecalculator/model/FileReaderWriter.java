package ec.edu.espe.cubevolumecalculator.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class FileReaderWriter {
    private String fileName;
    
    public FileReaderWriter(String volumeCube) {
        this.fileName=volumeCube;
    }
    
    public void writeFile(Cube cube){
        File file = new File(fileName);
        
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))){
            if (file.length() == 0) {
                writer.println("Number;Side Length;Volume\n");
            }
            int lineNumber = getLineCount(file) +1;
            writer.println(lineNumber + ";" + cube.getSideLength() + ";" + cube.getVolume());
            
        }   catch(IOException e){
            System.out.println("File did not open or does not work" + e.getMessage());
        }
    }
    
    private int getLineCount(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        return lineCount;
    }
    
    public void readFile(Cube cube){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("volumecube.csv"));
            String line = null;
            int lineNumber = 1;
            while((line = reader.readLine()) != null){
                String [] parts = line.split(";");
                int totalParts =   parts.length;
                for(int i = 0; i<totalParts; i++){
                    if(i == totalParts - 1){
                        System.out.println(parts [i]);
                    } else {
                        System.out.print(parts[i] + ";");
                    } 
                }
                lineNumber++;
            }
            reader.close();
        }catch(IOException e){
            System.out.println("File did not open or does not work" + e.getMessage());
        }
    }
    
    

}
