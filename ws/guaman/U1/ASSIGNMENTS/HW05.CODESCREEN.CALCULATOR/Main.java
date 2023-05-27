import java.util.Scanner;

public class Main{

    public static double calculateVolume(double radio, double high) {
        double Volume = Math.PI * radio * radio * high;
        return Volume;
    }

    public static void presentation() {
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("SUBJECT:   ORIENTED OBJECTS PROGRAMMING  ");
        System.out.println("NRC: 9642");
        System.out.println("INSTRUCTOR: EDISON LASCANO ");
        System.out.println("ASSIGMENT 4 CODE N1  :) ");
    }

    public static void main(String[] args) {
        presentation();

        System.out.println("        CILINDRIC VOLUME CALCULATOR \n");
        System.out.println("Enter the radius value in centimeters: ");
        Scanner go = new Scanner(System.in);
        double radio = go.nextDouble();
        System.out.println("Enter the high value in centimeters: ");
        Scanner hi = new Scanner(System.in);
        double high = hi.nextDouble();

        double volume = calculateVolume(radio, high);
        System.out.println("The Cilindric Volume is : " + volume);

    }
}