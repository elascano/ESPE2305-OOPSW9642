package ec.edu.espe.strategypattern.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import javax.swing.JOptionPane;
public class DbConnectionManager {
    public static DbConnectionManager instance;
    private MongoClient client;
    public void connectDb() {
        String uri = "mongodb+srv://PCarrera:PCarrera0603@cluster0.tag3gyw.mongodb.net/?retryWrites=true&w=majority";
        try {
            client = MongoClients.create(uri);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void closeConnection() {
        getClient().close();
    }
    
    private DbConnectionManager() {
        
    }
    
    public static synchronized DbConnectionManager getInstance() {
        if (instance == null) {
            instance = new DbConnectionManager();
        }
        return instance;
    }

    /**
     * @return the client
     */
    public MongoClient getClient() {
        return client;
    }
}


