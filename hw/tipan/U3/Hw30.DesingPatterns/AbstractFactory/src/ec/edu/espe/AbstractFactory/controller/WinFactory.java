
package ec.edu.espe.AbstractFactory.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class WinFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
}
