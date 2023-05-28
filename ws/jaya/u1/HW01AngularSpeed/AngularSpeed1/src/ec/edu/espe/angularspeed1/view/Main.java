/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.angularspeed1.view;

import ec.edu.espe.angularspeed1.controller.AngularSpeedController;
import ec.edu.espe.angularspeed1.model.AngularSpeedModel;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        AngularSpeedModel model = new AngularSpeedModel();
        AngularSpeedView view = new AngularSpeedView(model);
        AngularSpeedController controller = new AngularSpeedController(model, view);

        controller.calculateAngularSpeed();
    }
}
