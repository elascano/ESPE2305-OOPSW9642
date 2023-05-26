
package ec.edu.espe.angularspeed1.controller;

import ec.edu.espe.angularspeed1.model.AngularSpeedModel;
import ec.edu.espe.angularspeed1.view.AngularSpeedView;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class AngularSpeedController {
    private AngularSpeedModel model;
    private AngularSpeedView view;

    public AngularSpeedController(AngularSpeedModel model, AngularSpeedView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAngularSpeed() {
        view.getInput();
        double angularSpeed = model.calculateAngularSpeed();
        view.displayAngularSpeed(angularSpeed);
        view.saveToCSV(model.getAngularDisplacement(), model.getTime(), angularSpeed);
    }
}


