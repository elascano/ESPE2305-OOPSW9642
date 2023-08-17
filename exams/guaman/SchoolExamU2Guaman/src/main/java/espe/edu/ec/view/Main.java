
package espe.edu.ec.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import espe.edu.ec.utils.DatabaseManager;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        String uri = "mongodb+srv://guamanalcjordanalex:guamanalcjordanalex@cluster0.csafw5f.mongodb.net/?retryWrites=true&w=majority";
        MongoDatabase database = DatabaseManager.connectToDatabase(uri, "SchoolSystem");
        MongoCollection collection = database.getCollection("Schools");
        
        FrmUpdateSchool frmUpdateSchool = new FrmUpdateSchool(collection);
        frmUpdateSchool.setVisible(true);
    }
    
}
