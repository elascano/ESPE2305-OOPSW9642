
package edu.ecu.ec.observer.view;

import edu.ecu.ec.observer.model.Investor;
import edu.ecu.ec.observer.model.Stock;

/**
 *
 * @author USER
 *
 */
public class InvestorView implements Investor{
 private String name;

    public InvestorView(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock, Object args) {
        // Update view with the new stock information
        if (args instanceof String) {
            System.out.println("Investor " + name + " received symbol update: " + args);
        } else if (args instanceof Double) {
            System.out.println("Investor " + name + " received price update: " + args);
        }
    }   
}
