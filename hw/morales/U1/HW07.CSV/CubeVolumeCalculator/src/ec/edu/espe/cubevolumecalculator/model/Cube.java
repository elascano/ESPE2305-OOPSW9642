package ec.edu.espe.cubevolumecalculator.model;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class Cube {


    private double volume;
    private double sideLength;

    public Cube() {    
    }
        
    public double calculateCubeVolume(){
	volume = sideLength * sideLength * sideLength;
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
