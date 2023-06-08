package ec.edu.Thefamse.model;

import java.util.Scanner;
/**
 *
 * @author The FAMSE
 */
public class PurchaseModifier {
    private Reservation reservation;

    public PurchaseModifier(Reservation reservation) {
        this.reservation = reservation;
    }

    public void modifyPurchase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Modificar la compra:");
        System.out.println("1. Comprar producto");
        System.out.println("2. Cancelar compra");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                if (reservation.isPurchased()) {
                    System.out.println("El producto ya ha sido comprado.");
                } else {
                    System.out.println("Comprar producto");
                    reservation.purchase();
                }
                break;
            case 2:
                System.out.println("Cancelar compra");
                reservation.cancelPurchase();
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }
}

