/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.Thefamse.model;

/**
 *
 * @author The FAMSE
 */

public class State {
    private Reservation reservation;

    public State(Reservation reservation) {
        this.reservation = reservation;
    }

    public void viewState() {
        if (reservation.isPurchased()) {
            System.out.println("El producto ha sido comprado.");
        } else {
            System.out.println("El producto no ha sido comprado.");
        }
    }
}
