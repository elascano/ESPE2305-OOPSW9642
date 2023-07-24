
package ec.espe.edu.MovieSystem.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Movies {
    
   private String name;
    private float price;
    private String date;
    private int ticketSold;
    private float revenue;

    public Movies(String name, float price, String date, int ticketSold, float revenue) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.ticketSold = ticketSold;
        this.revenue= revenue;
    }

    public Movies() {
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", date=" + date + ", ticketSold=" + ticketSold + ",revenue"+ revenue+'}';
    }

    public String toStringData() {
        return name + "," + price + "," + date + "," + ticketSold + ","+ revenue;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the ticketSold
     */
    public int getTicketSold() {
        return ticketSold;
    }

    /**
     * @param ticketSold the ticketSold to set
     */
    public void setTicketSold(int ticketSold) {
        this.ticketSold = ticketSold;
    }
    /**
     * @return the ticketSold
     */
    public float getrevenue() {
        return revenue;
    }

    /**
     * @param revenue the revenue to set
     */
    public void setrevenue(float revenue) {
        this.revenue = revenue;
    }
}