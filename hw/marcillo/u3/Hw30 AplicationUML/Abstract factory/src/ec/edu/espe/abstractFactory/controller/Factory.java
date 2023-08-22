/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.controller.Connection;

/**
 *
 * @author USER
 */
public abstract class Factory {
    public Factory() {
    }
    
    public abstract Connection createConnection(String type);
}
