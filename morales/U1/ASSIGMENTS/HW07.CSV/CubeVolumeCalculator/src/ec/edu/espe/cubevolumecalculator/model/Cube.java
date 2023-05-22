package ec.edu.espe.cubevolumecalculator.model;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class Cube {

    public Cube(double sideLength1) {
    }
    private double volume;
    private double sideLength;
    
    public static double calculateCubeVolume(double sideLength){
	double volume = sideLength * sideLength * sideLength;
	return volume;
    }


    public double getVolume() {
        return volume;
    }
    public double getSideLength() {
        return sideLength;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    
}
