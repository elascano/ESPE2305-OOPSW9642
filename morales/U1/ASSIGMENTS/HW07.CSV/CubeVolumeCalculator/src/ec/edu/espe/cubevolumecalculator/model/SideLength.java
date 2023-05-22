package ec.edu.espe.cubevolumecalculator.model;

import ec.edu.espe.cubevolumecalculator.model.Cube;
import ec.edu.espe.cubevolumecalculator.view.UserMenu;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class SideLength {
    
    public static double enterSideLength(double sideLength){
	Scanner scanner = new Scanner(System.in);
        double volume;
        
        do{
            System.out.print("Enter the length of the side of the cube: ");
            sideLength = scanner.nextDouble();
            sideLength = UserMenu.validatePositive(sideLength);
            volume = Cube.calculateCubeVolume(sideLength);
            UserMenu.VolumePrint(volume);
            
        }while(sideLength <= 0);
        return volume;
    }

    private static void FileReaderWriter(double sideLength) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
