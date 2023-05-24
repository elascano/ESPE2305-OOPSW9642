package ec.edu.espe.heightformulawithscan.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;



public class CSVFile {
    private String file;
    
    public CSVFile(String file){
        this.file=file;
    }
    public void writeData(Height height) {
        File f = new File(file);

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            if (f.length() == 0) {
                writer.println("Initial Velocity; Final Velocity; Time; Height");
            }
            writer.println(height.getInitialVelocity() + ";" + height.getFinalVelocity() + ";" + height.getTime() + ";" + height.calculateHeigth());                       
        } catch (IOException e) {
            System.out.println("Error: Can't wirte file " + e.getMessage());
        }
    }
    public static final String QUOTE = "\"";
    public static void readData() throws IOException{
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader("Formula.csv"));
            String line = br.readLine();
            while (null!=line){
                String [] fields = line.split(";");
                System.out.println(Arrays.toString(fields));
                
                fields = removeTrailingQuotes(fields);
                System.out.println(Arrays.toString(fields));
                
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: No file found \n\n Enter data First \n");
        } finally {
            if (null!=br){
                br.close();
            }
        }
    }
    private static String [] removeTrailingQuotes(String[] fields){
        String result [] = new String[fields.length];
        
        for(int i=0;i<result.length;i++){
            result[i] = fields [i].replaceAll("^" + QUOTE,
                    "").replaceAll(QUOTE + "$", "");
        }
        return result;
    }
    
}
