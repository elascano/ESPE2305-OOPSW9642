package ec.edu.espe.factorymethod.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public interface Factory {
        
    Connection createConnection(String type); 
}
