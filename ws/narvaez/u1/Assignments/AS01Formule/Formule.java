public class Formule {
    public static void format(){
        System.out.println("Name: Leonardo Narvaez.");
        System.out.println("CRN: 9642");
        System.out.println("Object Oriented Programming");
        System.out.println("Instructor: Edison Lascano.");
        System.out.println("Slope Calculator");
    }
    public static float calculate_slope(float x_1, float y_1, float x_2, float y_2) {
        float X=x_2-x_1;
        float Y=y_2-y_1;
        float slope;
        slope=Y/X;
        return (slope);
    }

    public static void main(String[] args) {
        float firstpointX=8, firstpointY=6, secondpointX=15, secondpointY=3;
        float slope_line;
        slope_line=calculate_slope(firstpointX, firstpointY, secondpointX, secondpointY);
        format();
        System.out.println("\nThe slope of the line is of the coordinates : \n" +slope_line);
    }
}
