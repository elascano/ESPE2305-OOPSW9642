/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.quiz.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class D extends A {
    private E e;
    private F f;

    public D(E e, F f) {
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "D{" + "e=" + e + ", f=" + f + '}';
    }

    /**
     * @return the e
     */
    public E getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E e) {
        this.e = e;
    }

    /**
     * @return the f
     */
    public F getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(F f) {
        this.f = f;
    }
    
}
