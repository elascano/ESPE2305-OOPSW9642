/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO-ESPE
 */
public class Alpaca extends FarmAnimal implements ISheap{
    private Date lastSheering;
    private int laidWhool;

    /**
     * @return the lastSheering
     */
    public Date getLastSheering() {
        return lastSheering;
    }

    @Override
    public String toString() {
        return "Alpaca{" + super.toString() + "lastSheering=" + lastSheering + ", laidWhool=" + laidWhool + '}';
    }

    public Alpaca(Date lastSheering, int laidWhool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.laidWhool = laidWhool;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    /**
     * @return the laidWhool
     */
    public int getLaidWhool() {
        return laidWhool;
    }

    /**
     * @param laidWhool the laidWhool to set
     */
    public void setLaidWhool(int laidWhool) {
        this.laidWhool = laidWhool;
    }

    @Override
    public void sheer() {
        laidWhool += 1;
    }

    @Override
    public boolean feed(Food food) {
        return true;
        
    }

    @Override
    public int produce() {
        return 4;
    }
}
