package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Store {
    Scanner scanner = new Scanner(System.in);
    FileManager fileManager = new FileManager();
    ArrayList<Cellphone> cellphones = new ArrayList<>();
    
    
    public void addCelphone() {
        int id, memory;
        String model;
        System.out.println("Enter the cellphone id: ");
        id = scanner.nextInt();
        System.out.println("Enter the cellphone memory");
        memory = scanner.nextInt();
        System.out.println("Enter the cellphone model");
        model = scanner.next();
        
        Cellphone cell = new Cellphone(id, model, memory);
        cellphones.add(cell);
        fileManager.saveFile(cellphones, "cellPhonesData");
        System.out.println("Cellphones saved succefull");
    }
    
    public void deleteCellphone() {
        cellphones.clear();
        System.out.println("Cellphones deleted correctly");
        fileManager.saveFile(cellphones, "cellPhonesData");
    }
}
