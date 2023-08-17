/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exmansbanks;

/**
 *
 * @author USER
 */
public class Banks {
    private int id;
    private String name;
    private int count;
    private int iva;

    public Banks(int id, String name, int count, int iva) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.iva = iva;
    }


    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    
    
    
}
