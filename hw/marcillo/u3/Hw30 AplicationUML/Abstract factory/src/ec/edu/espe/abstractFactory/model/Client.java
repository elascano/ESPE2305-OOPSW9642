package ec.edu.espe.abstractFactory.model;

import ec.edu.espe.abstractFactory.controller.Factory;
import ec.edu.espe.abstractFactory.controller.Connection;

/**
 *
 * @author USER
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle");
        System.out.println("you are connecting with " + connection.description());
    }
    
}
