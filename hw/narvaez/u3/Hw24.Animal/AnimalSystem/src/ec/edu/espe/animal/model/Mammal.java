/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.animal.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NarvaezLeonardo
 */
public abstract class Mammal extends Animal{
    private boolean feed;
    ArrayList<Tooth> tooth;

    public Mammal(Date borOn) {
        super(borOn);
    }
  

    /**
     * @return the feed
     */
    public boolean isFeed() {
        return feed;
    }

    /**
     * @param feed the feed to set
     */
    public void setFeed(boolean feed) {
        this.feed = feed;
    }
    public abstract boolean feed();
}
