package ec.edu.espe.ellipsearea.model;

import java.io.*;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class EllipseAreaCSVFile {    
    
    public void writeHeader(){
    
        try{
            FileWriter fileWriterHeader = new FileWriter("D:\\EllipseAreaData.csv", true);
            BufferedWriter bufferedFileWriterHeader = new BufferedWriter(fileWriterHeader);
            PrintWriter printerWriter = new PrintWriter(bufferedFileWriterHeader);
            printerWriter.append("MajorRadiusValue" + "\t" + "MinurRadiusValue" + "\t" + "EllipseArea" + "\n");
            printerWriter.flush();
            printerWriter.close();
        }catch(IOException e){
            System.out.println(e);     
        }
        
    }
    
    public void writeAndRead(Double majorRadius, Double minurRadius, Double ellipseArea){
      
        String majorRadiusAuxiliar = Double.toString(majorRadius); 
        String minurRadiusAuxiliar = Double.toString(minurRadius);
        String ellipseAreaAuxiliar = Double.toString(ellipseArea);
        
        try{

            FileWriter fileWriter = new FileWriter("D:\\EllipseAreaData.csv", true);
            fileWriter.append(majorRadiusAuxiliar + "\t" + "\t" + "\t" + minurRadiusAuxiliar + "\t" + "\t"  + "\t" + ellipseArea + "\n");
            fileWriter.flush();
            fileWriter.close();
            
            FileReader fileReader = new FileReader("D:\\EllipseAreaData.csv");
            int valor=fileReader.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fileReader.read();
            }
            fileReader.close();
            
            
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
