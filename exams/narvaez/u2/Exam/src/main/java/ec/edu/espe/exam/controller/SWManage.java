
package ec.edu.espe.exam.controller;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.model.SmartWatch;
import ec.edu.espe.exam.utils.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class SWManage {
    DatabaseController database;
    MongoCollection collection;
    
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
    
    public void save(SmartWatch smartwatch){
        DatabaseManager.insertDocument(collection, smartwatch.getData());
    }
    
    public SmartWatch obtain(int id){
        HashMap<Object,Object> smartwatchMap = DatabaseManager.obtain(collection, id);
        String brand = smartwatchMap.get("Brand").toString();
        String color = smartwatchMap.get("Color").toString();

        return new SmartWatch(id, brand, color, id);
    }
    
    public ArrayList<SmartWatch> obtainAll(){
        ArrayList<HashMap<Object,Object>> smartwatchMaps = DatabaseManager.obtainAll(collection);
        
        ArrayList<SmartWatch> smartwatchs = new ArrayList<>();
                
        for(HashMap<Object,Object> map : smartwatchMaps){
            
            String brand = map.get("Brand").toString();
            int id = Integer.parseInt(map.get("Id").toString());
            String color = map.get("Color").toString();
            int price = Integer.parseInt(map.get(id).toString());
            
            SmartWatch smartwatch = new SmartWatch(id, brand, color, id);
            
            if(smartwatch != null){
                smartwatchs.add(smartwatch);
            }
        }
        return smartwatchs;
    }
}
