package ec.edu.espe.cubevolumecalculator.model;

import java.io.File;
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
                writer.println("Side Length;Volume");
            }
            writer.println(cube.getSideLength() + ";" + cube.getVolume());
            
        }   catch(IOException e){
            System.out.println("File did not open or does not work" + e.getMessage());
        }
    }
    
    

}
