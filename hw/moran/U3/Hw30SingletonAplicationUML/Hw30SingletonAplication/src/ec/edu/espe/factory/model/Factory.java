package ec.edu.espe.factory.model;

import ec.edu.espe.factory.controller.Connection;

/**
 *
 * @author David Moran, The_FAMSE
 */
public abstract class Factory {
    
    public Factory() {  
    }
    public abstract Connection createConnection(String type); //Factory method
}
