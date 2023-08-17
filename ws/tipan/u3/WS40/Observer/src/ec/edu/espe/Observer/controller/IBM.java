
package ec.edu.espe.Observer.controller;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */



public class IBM extends Stock {
    public IBM(String symbol, double price) {
        super(symbol, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price); 
    }

    @Override
    public void setSymbol(String symbol) {
        super.setSymbol(symbol);
    }
}

