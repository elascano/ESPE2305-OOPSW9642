/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm2.model;

/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class Egg {
    private int id;

    public Egg(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
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
    
}