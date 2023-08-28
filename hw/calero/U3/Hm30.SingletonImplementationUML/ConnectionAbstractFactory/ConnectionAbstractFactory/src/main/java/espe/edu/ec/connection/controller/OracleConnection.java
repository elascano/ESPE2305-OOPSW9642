/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.connection.controller;

import espe.edu.ec.connection.model.Connection;

/**
 *
 * @author yeshualinux
 */
public class OracleConnection implements Connection{
    public void connect() {
        System.out.println("Connected to Oracle");
    }

    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }
}
