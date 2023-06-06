public class PentagonVolumeCalculator {
    public static void main(String[] args) {
        double sideLength = 5.0;
        double apothemLength = 3.0;
        
        double volume = calculatePentagonVolume(sideLength, apothemLength);
        System.out.println("Leonel Tipan");   
        System.out.println("NRC: 9642");
        System.out.println("Pentagon volumen caculator");
        System.out.println("The volume of the pentagon is: " + volume);
    }
    
    public static double calculatePentagonVolume(double sideLength, double apothemLength) {
        double areaOfBase = calculatePentagonArea(sideLength, apothemLength);
        double height = 10.0;
        
        double volume = areaOfBase * height;
        return volume;
    }
    
    public static double calculatePentagonArea(double sideLength, double apothemLength) {
        double perimeter = 5 * sideLength;
        double area = (perimeter * apothemLength)/2;
        return area;
    }
}