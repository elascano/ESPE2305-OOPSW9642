package ec.edu.espe.cubevolumecalculator.model;

import ec.edu.espe.cubevolumecalculator.model.Cube;
import ec.edu.espe.cubevolumecalculator.view.UserMenu;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class SideLength {
    
    FileReaderWriter fileReader = new FileReaderWriter("volumecube.csv");
    
    public static void enterSideLength(Cube cube){
	Scanner scanner = new Scanner(System.in);
        
        double volume;
        do{
            System.out.print("Enter the length of the side of the cube: ");
            cube.setSideLength(scanner.nextDouble());
            if(cube.getSideLength()<0){
                System.out.println("ERROR");
            }
            cube.setVolume(cube.calculateCubeVolume());
            UserMenu.VolumePrint(cube.getVolume());
            
        }while(cube.getSideLength() <= 0);
    }
    

    private static void FileReaderWriter(double sideLength) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
