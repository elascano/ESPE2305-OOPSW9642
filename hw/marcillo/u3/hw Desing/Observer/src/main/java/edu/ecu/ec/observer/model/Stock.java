
package edu.ecu.ec.observer.model;

import edu.ecu.ec.observer.model.Investor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author USER
 */
public class Stock {
    protected String symbol;
    protected double price;
    private ArrayList<Investor> investors = new ArrayList<>();

    public Stock() {}

    public void addObserver(Investor investor) {
        investors.add(investor);
    }

    public void deleteObserver(Investor investor) {
        investors.remove(investor);
    }

    public void notifyObservers(Object args) {
        Iterator<Investor> iterator = investors.iterator();
        while (iterator.hasNext()) {
            Investor investor = iterator.next();
            investor.update(this, args);
        }
    }

    public void setPrice(double d) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setSymbol(String ibmtest) {
        throw new UnsupportedOperationException("Not supported yet."); }
}