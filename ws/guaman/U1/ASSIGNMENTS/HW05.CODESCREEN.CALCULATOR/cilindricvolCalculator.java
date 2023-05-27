import java.util.Scanner;
public class Main{
    
    public static double calculateVolume(double radius, double high){
        double Volume= Math.PI*radius*radius*high;
        return Volume;
    }
    public static void presentation(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("SUBJECT:   ORIENTED OBJECTS PROGRAMMING  ");
        System.out.println("NRC: 9642");
        System.out.println("INSTRUCTOR: EDISON LASCANO ");
        System.out.println("ASSIGMENT 4 CODE N1  :) ");
    }
    
    public static void main(String [] args){
        presentation();
       
    System.out.println("        CILINDRIC VOLUME CALCULATOR \n");
        double high = 10;
        double radius = 15;
        System.out.println("Radius Value in centimeters: "+radius);
        System.out.println("High value in centimeters: "+high);
  
        
        double volume = calculateVolume(radius, high);
        System.out.println("The Cilindric Volume is : "+volume);

        

    }
}