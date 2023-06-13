
package ec.edu.espe.model;

/**
 *
 * @author Jhordy Marcillo, CodeCrasfters, DCCO-ESPE
 */
public class attbanks {
    int id;
    String name;
    String dirrection;
    
    public attbanks(int id, String name, String dirrection) {
        this.id = id;
        this.name = name;
        this.dirrection = dirrection;
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

    public String getDirrection() {
        return dirrection;
    }

    public void setDirrection(String dirrection) {
        this.dirrection = dirrection;
    }    
}
