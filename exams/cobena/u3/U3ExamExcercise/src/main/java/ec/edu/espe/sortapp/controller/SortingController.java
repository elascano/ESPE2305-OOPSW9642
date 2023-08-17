/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.sortapp.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.sortapp.model.Sorting;
import ec.edu.espe.sortapp.utils.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class SortingController {
    MongoCollection collection;
    
    private static SortingController instance;
    
    private SortingController() {
        this.collection = DatabaseController.getInstance().changeCollection("arrayJoan");
    }
    
    public synchronized static SortingController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new SortingController();
        }
        
        return instance;
    }
    
    
    public boolean save(Sorting sorting){
        boolean verification;
        verification = DatabaseManager.insertDocument(collection, sorting.getData());
        return verification;
    }
    
    
    
    public boolean update(Sorting sorting){
        boolean verification;
        verification = DatabaseManager.updateDocument(collection, sorting.getData());
        return verification;
    
    }
    
    public boolean delete(Sorting sorting){
        boolean verification;
        verification = DatabaseManager.deleteDocument(collection, sorting.getData());
        return verification;
    }
    
    public int generateId(){
        int lastId = 0;
        ArrayList<HashMap<Object, Object>> components =  obtainAllFromDb();
        if(!components.isEmpty()){
            lastId = Integer.parseInt(components.get(components.size()-1).get("id").toString());
        }
        
        return lastId+1;
    }
    
    public ArrayList<HashMap<Object, Object>> obtainAllFromDb(){
        
        return DatabaseManager.obtainAll(collection);
    }
    
    public ArrayList<HashMap<Object, Object>> convertAllToHashMap(ArrayList<Sorting> sortings){
        ArrayList<HashMap<Object, Object>> convertedComponents = new ArrayList<>();
        for(Sorting sorting : sortings){
            convertedComponents.add(sorting.getData());
        }
        return convertedComponents;
    }
   
    
}
