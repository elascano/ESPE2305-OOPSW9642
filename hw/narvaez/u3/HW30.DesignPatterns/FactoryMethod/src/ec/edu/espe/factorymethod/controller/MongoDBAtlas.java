/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.factorymethod.controller;

import ec.edu.espe.factorymethod.model.Connection;

/**
 *
 * @author NarvaezLeonardo
 */
public class MongoDBAtlas extends Connection{
    public MongoDBAtlas(){
    }
    public String description(){
       return "MongoDBAtlas";
    }
}
