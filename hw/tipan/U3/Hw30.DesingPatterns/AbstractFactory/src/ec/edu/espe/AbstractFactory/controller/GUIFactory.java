
package ec.edu.espe.AbstractFactory.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE"); 
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new LinuxFactory();
        }
    }

    public abstract Button createButton();
    public abstract Menu createMenu();

 
    private static int readFromConfigFile(String key) {
     
        return 0;
    }
}