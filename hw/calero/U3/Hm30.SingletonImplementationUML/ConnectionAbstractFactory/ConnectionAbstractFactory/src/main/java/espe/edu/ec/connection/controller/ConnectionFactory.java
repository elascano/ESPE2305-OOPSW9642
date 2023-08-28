/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.connection.controller;

import java.sql.Connection;

/**
 *
 * @author yeshualinux
 */
public abstract class ConnectionFactory {
    public abstract Connection createConnection(String type);
}
