package ec.edu.espe.connection.controller;

import ec.edu.espe.connection.model.Connection;
import ec.edu.espe.connection.model.MySqlConnection;
import ec.edu.espe.connection.model.OracleConnection;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class FactoryOne extends Factory{
    public Connection createConnection(String type){
        if(type.equals("Oracle")){
            return new OracleConnection();
        }else{
            return new MySqlConnection();
        }
    }
}
