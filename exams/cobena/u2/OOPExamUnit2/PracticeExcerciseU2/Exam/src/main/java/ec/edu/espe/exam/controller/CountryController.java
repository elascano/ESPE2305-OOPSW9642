
package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.model.Country;
import ec.edu.espe.exam.utils.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class CountryController {
    DatabaseController database;
    MongoCollection collection;
    
    private static CountryController instance;
    
    private CountryController() {
        this.database = DatabaseController.getInstance();
        this.collection = DatabaseController.getInstance().changeCollection("Country");
    }
    
    public synchronized static CountryController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new CountryController();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    public void save(Country country){
        DatabaseManager.insertDocument(collection, country.getData());
    }
    
    public Country obtain(int id){
        HashMap<Object,Object> countryMap = DatabaseManager.obtain(collection, id);
        String name = countryMap.get("name").toString();
        int population = Integer.parseInt(countryMap.get("population").toString());
        Double averageSalary = Double.parseDouble(countryMap.get("averageSalary").toString());

        Country country = new Country(id, name, population, averageSalary);
        return country;
    }
    
    public ArrayList<Country> obtainAll(){
        ArrayList<HashMap<Object,Object>> countryMaps = DatabaseManager.obtainAll(collection);
        
        ArrayList<Country> countrys = new ArrayList<>();
                
        for(HashMap<Object,Object> countryMap : countryMaps){
            int id = Integer.parseInt(countryMap.get("id").toString());
            String name = countryMap.get("name").toString();
            int population = Integer.parseInt(countryMap.get("population").toString());
            Double averageSalary = Double.parseDouble(countryMap.get("averageSalary").toString());

            Country country = new Country(id, name, population, averageSalary);
            
            if(country != null){
                countrys.add(country);
            }
        }
        return countrys;
    }
    
    public Double getAproximatedMoneyInCountry(Country country){
        Double moneyInCountry;
        
        moneyInCountry = country.getAverageSalary() * country.getPopulation();
        
        return moneyInCountry;
    }
}
