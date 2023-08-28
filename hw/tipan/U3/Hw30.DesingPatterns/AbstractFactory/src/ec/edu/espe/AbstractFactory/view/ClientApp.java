
package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.controller.Button;
import ec.edu.espe.AbstractFactory.controller.GUIFactory;



/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class ClientApp {
        public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
    
}
