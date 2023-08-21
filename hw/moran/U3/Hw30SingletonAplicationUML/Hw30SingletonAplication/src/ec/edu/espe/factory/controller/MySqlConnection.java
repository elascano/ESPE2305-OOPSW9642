package ec.edu.espe.factory.controller;

/**
 *
 * @author David Moran, The_FAMSE
 */
public class MySqlConnection extends Connection{
    
    public MySqlConnection() {
    }
    public String description(){
        return "MySQL";
    }
}
