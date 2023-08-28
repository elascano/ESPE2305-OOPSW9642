package ec.edu.espe.factorymethod.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FactoryOne implements Factory {
    @Override
    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySqlConnection(); 
        }
    }
}
