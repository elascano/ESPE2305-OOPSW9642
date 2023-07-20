
package ec.espe.edu.jsons.exerciseexam2.model;

/**
 *
 * @author wfcad
 */
public class Cellphone {
    private int id;
    private int memory;
    private String Brand;

    public Cellphone(int id, int memory, String Brand) {
        this.id = id;
        this.memory = memory;
        this.Brand = Brand;
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

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
}
