package ec.edu.espe.factorymethod.model;

import ec.edu.espe.factorymethod.controller.MongoDBConnection;


public abstract class Factory {
    public Factory() {
    }
    
    public Connection createConnection(String type) {
        if (type.equals("MongoDB")) {
            return new MongoDBConnection();
        } else {
            return null; 
        }
    }
}
