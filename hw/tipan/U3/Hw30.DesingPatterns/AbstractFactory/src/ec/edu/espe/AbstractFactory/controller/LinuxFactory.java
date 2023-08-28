
package ec.edu.espe.AbstractFactory.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory {
    @Override
    public Button createButton() {
    return(new LinuxButton());
    }
    @Override
    public Menu createMenu() { return(new LinuxMenu());
    }

    
}
