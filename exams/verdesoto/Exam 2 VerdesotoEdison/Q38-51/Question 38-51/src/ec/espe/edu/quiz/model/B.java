/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.quiz.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class B extends A {
    private H h;

    public B(H h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }

    /**
     * @return the h
     */
    public H getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(H h) {
        this.h = h;
    }
    
}
