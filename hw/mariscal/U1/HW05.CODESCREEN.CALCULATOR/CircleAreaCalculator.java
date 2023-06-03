
public class CircleAreaCalculator {

public static void main(String[] args) {
    
    int diameter =10;
    System.out.println("Hello World!");
    System.out.println("Nane: Mesias Mariscal");
    System.out.println("NRC 9642");
    System.out.println("Objetc Oriented Programing");
    System.out.println("Enter the diameter to calculate the area of the circle and the triangle formed inside.");

    calculateArea(diameter );

    }

static void calculateArea(int diameter ) {
    float triangleArea ;
    float radius ;
    float circleArea ;
    float pi = 3.1416f;
    radius  = diameter / 2f;
    circleArea  = pi * radius * radius;
    triangleArea  = (diameter  * diameter  * (float)Math.sqrt(3))/4;  
    System.out.println("The area of the circle is: " + circleArea );  
    System.out.println("The area of the triangle formed inside the circle is: "+ triangleArea );

}

}

