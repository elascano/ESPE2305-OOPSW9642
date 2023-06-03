public class EllipseArea {

    public static void main(String[] args) {
        

        System.out.println("RUBEN BENAVIDES");
        System.out.println("OOP NRC 9642");
        System.out.println("Hello, welcome to the Ellipse Area Calculator!");

        double majorRadiusValue = 5;
        double minorRadiusValue = 5;
        
        calculateEllipseArea(majorRadiusValue, minorRadiusValue);
    }
    
    public static void calculateEllipseArea(double majorRadius, double minorRadius){
        
        double PI = 3.14;
        double ellipseArea = majorRadius * minorRadius * PI;
        
        System.out.println("The Ellipse Area is: " + ellipseArea + "u²");
    
    }
    
}
