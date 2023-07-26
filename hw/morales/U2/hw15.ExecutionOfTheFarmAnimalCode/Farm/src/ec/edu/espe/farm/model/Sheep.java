package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class Sheep extends FarmAnimal{

    private String color;
    private Date lastSheering;

    public Sheep(String color, Date lastSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.color = color;
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + "color=" + color + ", lastSheering=" + lastSheering + '}';
    }
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the lastSheering
     */
    public Date getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 0;
    }
    
}
