
package ec.edu.espe.formula.view;

import ec.edu.espe.formula.controller.ohmController;
import java.io.IOException;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ohmInterface {
    public static void main(String[] args) throws IOException {
        ohmController taskController = new ohmController();
        taskController.start();
    }
}

