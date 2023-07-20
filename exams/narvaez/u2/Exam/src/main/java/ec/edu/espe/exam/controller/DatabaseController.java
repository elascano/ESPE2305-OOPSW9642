package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.utils.DatabaseManager;
import org.bson.Document;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class DatabaseController {
    String clientURL;
    String SmartWatch;
    MongoDatabase database;

    private static DatabaseController instance;
    
    private DatabaseController() {
        this.clientURL = "mongodb+srv://LeoNarvaez:LeoNarvaez@leonarvaez.obdo638.mongodb.net/";
        this.SmartWatch = "Exam";
        this.database = DatabaseManager.connectToDatabase(clientURL, SmartWatch);
    }
    
    public synchronized static DatabaseController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new DatabaseController();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    public MongoCollection changeCollection(String Products){
        MongoCollection <Document> collection = DatabaseManager.connectToCollection(database, SmartWatch);
        return collection;
    }
}
