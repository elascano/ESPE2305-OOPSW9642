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
public class MongoDbConnectionFactory extends ConnectionFactory{
    public Connection createConnection(String type) {
        if (type.equals("MongoDB")) {
            return (Connection) new MongoDbConnection();
        }
        return null;
    }
}
