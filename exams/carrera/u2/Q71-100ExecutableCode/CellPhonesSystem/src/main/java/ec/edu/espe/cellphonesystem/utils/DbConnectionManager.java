package ec.edu.espe.cellphonesystem.utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import javax.swing.JOptionPane;
public class DbConnectionManager {
    MongoClient client;
    public MongoClient connectDb() {
        String uri = "mongodb+srv://PCarrera:PCarrera0603@cluster0.tag3gyw.mongodb.net/?retryWrites=true&w=majority";
        try {
            client = MongoClients.create(uri);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return client;
    }

    public void closeConnection() {
        client.close();
    }
}


