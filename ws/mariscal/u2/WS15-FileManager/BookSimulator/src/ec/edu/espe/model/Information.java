package ec.edu.espe.model;

/**
 *
 * @author Jhordy Marcillo, CodeCrasfters, DCCO-ESPE
 */
public class Information {

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
 private int id;
 private String name;
 private String author;
 private String editorial;
 private float price;

   

    public Information() {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
