class Cone {
    private double radius = 5;
    private double height = 10;

    public Cone(double radius, double height) {
    }

    public double calculateVolume() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double volume = (1 / 3) * baseArea * height;
        return volume;
    }
}

public class ConeMain {
    public static void main(String[] args) {
        double coneRadius = 0.0;
        double coneHeight = 0.0;

        Cone myCone = new Cone(coneRadius, coneHeight);
        double volume = myCone.calculateVolume();

        System.out.println("The cone with characteristics 5m radius and 10m height");
	System.out.println("has a volumen: " + volume + "m");
    }
}
