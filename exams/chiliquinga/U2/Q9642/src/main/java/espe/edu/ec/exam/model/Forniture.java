package espe.edu.ec.exam.model;

/**
 *
 * @author yeshualinux
 */
public class Forniture {
    private int id;
    private String element;
    int count;
    int price;

    @Override
    public String toString() {
        return "Forniture{" + "id=" + id + ", element=" + element + ", count=" + count + ", price=" + price + '}';
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
