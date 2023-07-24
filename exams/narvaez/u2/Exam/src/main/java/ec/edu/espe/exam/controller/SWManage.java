
package ec.edu.espe.exam.controller;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.exam.model.SmartWatch;
import ec.edu.espe.exam.utils.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class SWManage {
    DatabaseController database;
    MongoCollection collection;
    String searchField;
    
  
    private static SWManage instance;
    
    private SWManage() {
        this.database = DatabaseController.getInstance();
        this.collection = DatabaseController.getInstance().changeCollection("Smart Watch");
    }
    
    public synchronized static SWManage getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new SWManage();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    public boolean delete(int id) {
        Bson query = Filters.eq("Id", id);
        DeleteResult result = collection.deleteOne(query);
        return result.getDeletedCount() > 0;
    }

    public MongoCollection<Document> getCollection() {
        return this.collection;
    }
    private boolean existsDocument(MongoCollection<HashMap<Object, Object>> collection, Bson query) {
        return collection.find(query).first() != null;
    }

    public void updateDocument(int id, String targetField, Object newValue) {
        if (DatabaseManager.updateDocument(collection, "Id", id, targetField, newValue)) {
            System.out.println("Document updated successfully");
        } else {
            System.out.println("Document update failed");
        }
    }
    public void save(SmartWatch smartwatch){
        DatabaseManager.insertDocument(collection, smartwatch.getData());
    }
    
    public SmartWatch obtain(int id){
        HashMap<Object,Object> smartwatchMap = DatabaseManager.obtain(collection, id);
        String brand = smartwatchMap.get("Brand").toString();
        String color = smartwatchMap.get("Color").toString();
        int price = Integer.parseInt(smartwatchMap.get("Price").toString());

        return new SmartWatch(id, brand, color, price);
    }
    
    public ArrayList<SmartWatch> obtainAll(){
        ArrayList<HashMap<Object,Object>> smartwatchMaps = DatabaseManager.obtainAll(collection);
        
        ArrayList<SmartWatch> smartwatchs = new ArrayList<>();
                
        for(HashMap<Object,Object> map : smartwatchMaps){
            
            String brand = map.get("Brand").toString();
            int id = Integer.parseInt(map.get("Id").toString());
            String color = map.get("Color").toString();
            int price = Integer.parseInt(map.get("Price").toString());
            
            SmartWatch smartwatch = new SmartWatch(id, brand, color, price);
            
            if(smartwatch != null){
                smartwatchs.add(smartwatch);
            }
        }
        return smartwatchs;
    }

    public SmartWatch getSmartWatchById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean update(int price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
