package ec.edu.espe.factorymethod.controller;

import ec.edu.espe.factorymethod.model.Connection;


public class MongoDBConnection extends Connection {
    public MongoDBConnection() {
    }
    
    @Override
    public String description() {
        return "MongoDB";
    }
}
