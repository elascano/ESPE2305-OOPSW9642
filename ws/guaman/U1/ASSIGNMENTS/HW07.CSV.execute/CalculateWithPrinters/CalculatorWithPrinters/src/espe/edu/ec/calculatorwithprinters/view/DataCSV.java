package espe.edu.ec.calculatorwithprinters.view;
import espe.edu.ec.calculatorwithprinters.model.Measures;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class DataCSV {
    public static void dataGeneratorCSV(List<Measures>measures, String filename){
        int Pi=3.1416;
    try{
        FileWriter CSVData = new FileWriter(filename);
        CSVData.append("order,radius,high,volume\n");
        int order = 1;
        for(Measures measure : measures){
            float radius = measure.getRadius();
            float high = measure.getHigh();
            float volume = (Pi*radius*radius*high);
            
            CSVData.append(order+","+radius+","+high+","+volume+"\n");
            order++;
          
        }
        
        CSVData.flush();
        CSVData.close();
        
        System.out.println(".csv created: "+filename);
    }catch (IOException e){
        System.out.println("Error creating .csv file: "+ e.getMessage());
    }
    }
    
}
