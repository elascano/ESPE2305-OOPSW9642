package ec.edu.espe.factorymethod.model;

import ec.edu.espe.factorymethod.controller.MongoDBAtlas;
import ec.edu.espe.factorymethod.controller.MongoDBConnection;


public class FactoryOne extends Factory {
    @Override
    public Connection createConnection(String type) {
        if (type.equals("MongoDB")) {
            return new MongoDBConnection();
        } else {
            return new MongoDBAtlas(); 
        }
    }
}
