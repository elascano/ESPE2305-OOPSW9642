package ec.edu.espe.model;


/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
//F
public class Cellphone {
   private int id;
   private String model;
   private int memory;

    public Cellphone(int id, String model, int memory) {
        this.id = id;
        this.model = model;
        this.memory = memory;
    }
    
    
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the memory
     */
    public int getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }
}
