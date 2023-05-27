public class SemicircleArea {
    
    public static double CalculateAreaOfASemicircle(double radio) {
        double area = (Math.PI * Math.pow(radio, 2)) / 2;
        return area;
    }
    
    public static void main(String[] args) {

        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");

	System.out.println("Student Name:Adonny Calero ");

	System.out.println("Subject:Object Oriented Programming ");

        double radioValue = 6;
        
        double semicircleArea = CalculateAreaOfASemicircle(radioValue);
        
        System.out.println("The area of the semicircle is: " + semicircleArea);
    }
}