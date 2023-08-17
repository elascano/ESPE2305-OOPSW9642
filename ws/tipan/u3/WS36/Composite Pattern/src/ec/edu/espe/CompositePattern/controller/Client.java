
package ec.edu.espe.CompositePattern.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Client {
    // This class relates to a specific Employee
    public static Employee employee;

    public static void doClientTasks() {
        // Do work with this employee
        employee.stateName();
    }
}
