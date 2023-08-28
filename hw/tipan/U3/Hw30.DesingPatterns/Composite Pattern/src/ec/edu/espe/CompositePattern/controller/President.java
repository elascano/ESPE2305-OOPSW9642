
package ec.edu.espe.CompositePattern.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class President extends Supervisor {
    private static President president = new President();

    private President() {
        name = "Pete";
        title = "President";
    }

    public static President getPresident(String pete) {
        return president;
    }
}
