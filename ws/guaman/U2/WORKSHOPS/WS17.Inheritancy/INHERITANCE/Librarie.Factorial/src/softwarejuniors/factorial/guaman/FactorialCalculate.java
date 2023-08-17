package softwarejuniors.factorial.guaman;
import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int option = 0;
        while (option != 3) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Calcular divergencia");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese un numero para calcular el factorial: ");
                    int numeroFactorial = scanner.nextInt();
                    int factorial = calcularFactorial(numeroFactorial);
                    System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);
                    break;
                case 2:
                    System.out.print("Ingrese un número para calcular la divergencia: ");
                    int numeroDivergencia = scanner.nextInt();
                    int divergencia = calculateDivergencia(numeroDivergencia);
                    System.out.println("La divergencia de " + numeroDivergencia + " es: " + divergencia);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
public static int calculateDivergencia(int numero) {
    int divergencia = 0;
    
    for (int i = 0; i < divergencia; i++) {
        if (i % 2 == 0) {
            divergencia -= i;
        } else {
            divergencia += i;
        }
    }
    
    return divergencia;
}

}
