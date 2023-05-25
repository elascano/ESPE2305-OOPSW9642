package ec.edu.espe.ohmsLaw.view;

import ec.edu.espe.ohmsLaw.controller.ohmController;
import java.io.IOException;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class ohmInterface {
    public static void main(String[] args) throws IOException {
        ohmController taskController = new ohmController();
        taskController.start();
    }
}

