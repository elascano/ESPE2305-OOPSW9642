
package ec.edu.espe.Observer.controller;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */


public class Stock {
    protected String symbol; 
    protected double price;   
    private ArrayList<IInvestor> investors = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void addObserver(IInvestor iInvestor) {
        investors.add(iInvestor);
    }

    public void deleteObserver(IInvestor iInvestor) {
        investors.remove(iInvestor);
    }

    public void notifyObservers(Object args) {
        Iterator<IInvestor> i = investors.iterator();
        while (i.hasNext()) {
            IInvestor investor = i.next();
            investor.update(this, args);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers(symbol);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }
}

