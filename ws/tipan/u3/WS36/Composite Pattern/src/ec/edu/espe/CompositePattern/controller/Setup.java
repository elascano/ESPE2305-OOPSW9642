
package ec.edu.espe.CompositePattern.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Setup {
    public static void main(String args[]) {
        // Create employees
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");

        // Create managers
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);

        Teller juanita = new Teller("Juanita");
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");

        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);

        // Create the president's direct reports
        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);

        // Set the client's employee and perform tasks
        Client.employee = pete;
        Client.doClientTasks();
    }
}
