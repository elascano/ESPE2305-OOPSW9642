/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.josu.model;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Variables {
    public int base1;
    public int base2;
    public int area;
    

    @Override
    public String toString() {
        return "Task{" + "base1=" + getBase1() + ", resistence=" + getBase2() + ", voltage=" + getArea() + '}';
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
}
