
package ec.edu.espe.exam.model;

import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Country implements Mapeable{

    HashMap<Object, Object> mapedData;
    private int id;
    private String name;
    private int population;
    private Double averageSalary;

    public Country(int id, String name, int population, Double averageSalary) {
        mapedData.put("id", id);
        mapedData.put("name", name);
        mapedData.put("population", population);
        mapedData.put("averageSalary", averageSalary);
        
        this.id = id;
        this.name = name;
        this.population = population;
        this.averageSalary = averageSalary;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    public Double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }
    
    
    @Override
    public HashMap<Object, Object> getData() {
       return mapedData;
    }
    
}
