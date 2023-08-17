
package ec.edu.espe.CompositePattern.controller;

import java.util.Vector;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public abstract class Supervisor extends Employee {
    public Vector<Employee> directReports = new Vector<>();

    @Override
    public void stateName() {
        super.stateName();
        if (!directReports.isEmpty()) {
            for (Employee directReport : directReports) {
                directReport.stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.addElement(anEmployee);
    }
}
