
package ec.edu.espe.AbstractFactory.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class LinuxButton extends Button {

    @Override
    public void paint() {
    System.out.println("I'm a LinuxButton:" + caption);
    }

}
