package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class DensityCalculator {
    FileManager save = new FileManager();
    Scanner scanner = new Scanner(System.in);
    
    float density;
    float mass;
    float volume;
    
    public void calculateDensity() {
        System.out.println("Enter the mass value: ");
        mass = scanner.nextInt();
        System.out.println("Enter the volume value: ");
        volume = scanner.nextInt();
        
        density = mass / volume;
        System.out.println("The density is: "+ density);
        
        save.saveData(mass, volume, density);
    }
 }
    