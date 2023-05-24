package ec.edu.espe.spherevolumecalculation.model;
/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */

import java.lang.Math;

public class Sphere {
    private double radius;
    private double volume;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.valueOf(radius) + "," + String.valueOf(volume);
    }
    
    public double calculateVolume(){
        double PI = 3.14159265;
	double volume1 = (4*PI*(Math.pow(radius, 3)))/3;
	return volume1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
