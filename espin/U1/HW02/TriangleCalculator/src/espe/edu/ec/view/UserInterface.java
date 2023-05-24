
package espe.edu.ec.view;
import java.util.*;
import espe.edu.ec.model.Triangle;

/**
 *
 * @author Andres Espin, The javas, DCOO-ESPE
 */
public class UserInterface {
    public Triangle inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese la base del triangulo: ");
        double base=scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double height=scanner.nextDouble();
        System.out.print("Ingrese el lado uno del triangulo: ");
        double sideOne=scanner.nextDouble();
        System.out.print("Ingrese el lado dos del triangulo: ");
        double sideTwo=scanner.nextDouble();
        System.out.print("Ingrese el lado tres del triangulo: ");
        double sideThree=scanner.nextDouble();
        
        return new Triangle(base,height,sideOne,sideTwo,sideThree); 
    }
    
    public void showMenu() {
        System.out.println("1. Calcular area y perimetro");
        System.out.println("2. Ver datos guardados");
        System.out.println("3. Salir");
    }
}
