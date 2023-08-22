/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;

import ec.edu.espe.abstractFactory.controller.OracleConnection;
import ec.edu.espe.abstractFactory.controller.MySqlConnection;
import ec.edu.espe.abstractFactory.controller.Factory;
import ec.edu.espe.abstractFactory.controller.Connection;

/**
 *
 * @author USER
 */
public class FactoryOne extends Factory {

    public FactoryOne() {
    }
    public Connection createConnection(String type){
        if(type.equals("Oracle")){
         return new OracleConnection();   
        }
        else{
            return new MySqlConnection();
        }
    }
}
