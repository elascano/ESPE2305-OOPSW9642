package ec.edu.Thefamse.model;

/**
 *
 * @author The FAMSE
 */
public class Reservation {
    private  NutProduct product;
    private boolean purchased;

    public Reservation(NutProduct product) {
        this.product = product;
        this.purchased = false;
    }
    
    public void cancelPurchase() {
    if (purchased) {
        purchased = false;
        System.out.println("Compra cancelada.");
    } else {
        System.out.println("No se ha realizado ninguna compra.");
    }
}

    public void purchase() {
        if (!purchased) {
            purchased = true;
            System.out.println("Compra realizada.");
        }
    }

    public NutProduct getProduct() {
        return product;
    }

    public boolean isPurchased() {
        return purchased;
    }

   
}
