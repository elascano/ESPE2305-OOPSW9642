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
public class OracleConnection extends Connection{
    public OracleConnection(){
        
    }
    
    public String description () {
    return "Oracle";
    }
}
