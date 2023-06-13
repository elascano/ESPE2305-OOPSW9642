
package ec.edu.espe.view;
import ec.edu.espe.model.attbanks;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import java.io.IOException;
import java.lang.Object;
/**
 *
 * @author Jhordy Marcillo, CodeCrasfters, DCCO-ESPE
 */
public class Banks {

    public static void main(String[] args) {
        attbanksShowInfo();
        attbanks Attbanks;
        
        
    }    
    private static void attbanksShowInfo(){
        attbanks Attbanks;
        Scanner scan;
        
        scan = new Scanner(System.in);
        
        int id;
        String name;
        String direcction;
        ArrayList<String> informationBanks;
        informationBanks = new ArrayList<>();
        
        System.out.println("enter ID");
        id = scan.nextInt();
        
        System.out.println("enter name");
        name = scan.nextLine();
        
        System.out.println("enter direction");
        direcction = scan.nextLine();
       
        Gson gson = new Gson();
        String json = gson.toJson(id);
        
        try (FileWriter fw = new FileWriter("informationBanks.json");){
            fw.write(json);
            System.out.println("File was saved");
        }catch(Exception e){
            System.out.println("error: file not open or found");
            
        }
    }
    
}
