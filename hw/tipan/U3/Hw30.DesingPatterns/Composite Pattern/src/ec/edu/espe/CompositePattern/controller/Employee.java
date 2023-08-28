
package ec.edu.espe.CompositePattern.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}