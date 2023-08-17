/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.umltocode.model;

import java.util.ArrayList;

/**
 *
 * @author NarvaezLeonardo
 */
public class D extends A{
    private ArrayList<E> e;

    @Override
    public String toString() {
        return "D{" + "e=" + e + ", f=" + f + '}';
    }

    public D(ArrayList<E> e, ArrayList<F> f) {
        this.e = e;
        this.f = f;
    }
    private ArrayList<F> f;

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }
}
