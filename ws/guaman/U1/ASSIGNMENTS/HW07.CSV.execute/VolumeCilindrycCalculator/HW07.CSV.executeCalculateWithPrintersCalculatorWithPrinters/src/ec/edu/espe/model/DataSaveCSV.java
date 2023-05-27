
package ec.edu.espe.model;
import ec.edu.espe.model.CalculatorVolume;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class DataSaveCSV {
    
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    
    public void createFile(){
        try {
            
            File file = new File (fileName + ".csv");
            if (file.exists()){
          
            }else if(file.createNewFile()){
                System.out.println("Files created successfull");
            }
              
        }
        catch(IOException e){
            System.out.println("Falied Process");
        }
    }
    
    
        
        public void write(CalculatorVolume calculatorvolume){
        File file = new File(fileName + ".csv");
        if(file.exists()){
         
            
            writeIfFileExists(calculatorvolume);
        }
        else{
            writeIfFileDoesNotExists(calculatorvolume);
        }
    }
        public void writeIfFileExists(CalculatorVolume calculatorvolume){

        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv", true));){
            fileWriter.write(calculatorvolume.toString());
            fileWriter.newLine();
            fileWriter.flush();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
    }

    public void writeIfFileDoesNotExists(CalculatorVolume calculatorvolume){
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName + ".csv"));){
            fileWriter.write(" Data height  , Data radius, Result volume\n"
                     + calculatorvolume.toString()+" \n");
            fileWriter.flush();
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }

    }

       public void readFile(){
        String line;
        String LinesParts[]= new String[3];
        double numberData;
        double numberData1;
        double numberData2;
        
        
        
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName + ".csv"));){
            fileReader.readLine();
            
           do{
               
               line = fileReader.readLine();
               if(line == null){
                   break;
               }
               splitLine(line,LinesParts,",");
               numberData=Double.parseDouble(LinesParts[0]);
               numberData1=Double.parseDouble(LinesParts[1]);
               numberData2=Double.parseDouble(LinesParts[2]);
               
               System.out.print("  Cilinder Heigh: "+numberData);
               System.out.print("  Cilinder Radius: "+numberData1);
               System.out.print("  Cilinder Volume: "+numberData2+"\n");
               
       
               
               
               
           }while(line != null);
        
        }
        catch(IOException e){
            System.out.println("There was an error writing in the file");
        }
        
    }
       public void splitLine (String line, String[] LinesParts,String Separator){
           int i=0;
           String Rees[] = line.split(Separator);
           for(String cut : Rees){
               LinesParts[i]= cut;
               i++;
           }
               
           
       
       
       }
}

