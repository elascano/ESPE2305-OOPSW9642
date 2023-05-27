
package ec.edu.espe.angularspeed1.model;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */


public class AngularSpeedModel {

    public double getAngularDisplacement() {
        return angularDisplacement;
    }

    public double getTime() {
        return time;
    }
    private double angularDisplacement;
    private double time;

    public void setAngularDisplacement(double angularDisplacement) {
        this.angularDisplacement = angularDisplacement;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double calculateAngularSpeed() {
        return angularDisplacement / time;
    }
}

