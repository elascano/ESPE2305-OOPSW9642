package ec.edu.Thefamse.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author The FAMSE
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NutStore {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean salir = false;
        NutProduct product = null;
        Reservation reservation = null;
        List<NutCustomer> customers = new ArrayList<>();

        while (!salir) {
            System.out.println("Menu de opciones: ");
            System.out.println("1. Crear usuario.");
            System.out.println("2. Agregar nuevo producto.");
            System.out.println("3. Comprar producto.");
            System.out.println("4. Editar compra.");
            System.out.println("5. Estado de compra.");
            System.out.println("6. Generar archivo de reportes.");
            System.out.println("7. Salir.");

            try {
                System.out.println("Ingrese la opcion que desea visualizar: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("--Usted ha ingresado en creacion de usuario--");
                        NutCustomer customer = NutCustomer.createAccount();
                        customers.add(customer); // Agregar el cliente a la lista de clientes
                        System.out.println("Cuenta creada.");
                        break;
                    case 2:
                        product = NutProduct.addProduct();
                        System.out.println("Producto agregado.");
                        break;
                    case 3:
                        if (product == null) {
                            System.out.println("No se ha seleccionado ningún producto.");
                        } else {
                            if (reservation == null) {
                                reservation = new Reservation(product);
                            }

                            if (reservation.isPurchased()) {
                                System.out.println("Ya realizo la compra.");
                            } else {
                                reservation.purchase();
                            }
                        }
                        break;
                    case 4:
                        if (reservation == null) {
                            System.out.println("No se ha realizado ninguna compra.");
                        } else {
                            PurchaseModifier purchaseModifier = new PurchaseModifier(reservation);
                            purchaseModifier.modifyPurchase();
                        }
                        break;
                    case 5:
                        if (reservation == null) {
                            System.out.println("No se ha realizado ninguna compra.");
                        } else {
                            State state = new State(reservation);
                            state.viewState();
                        }
                        break;
                    case 6:
                         System.out.println("--Generar reporte--");
                        Report.generateReportJSON(customers);
                        System.out.println("Reporte generado.");
                        break;
                    case 7:
                        salir = true; // Actualizar la variable salir para salir del bucle
                        System.out.println("Gracias, buen dia.");
                        break;
                    default:
                        System.out.println("Opción incorrecta, ingrese de nuevo: ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo puede ingresar numeros.");
                scanner.next();
            }
        }
    }
}