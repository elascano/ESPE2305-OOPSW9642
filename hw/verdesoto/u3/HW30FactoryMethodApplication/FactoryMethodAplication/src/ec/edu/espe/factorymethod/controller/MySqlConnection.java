package ec.edu.espe.factorymethod.controller;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class MySqlConnection extends Connection{

    @Override
    public String description() {
        return "MySql"; 
    }

}
