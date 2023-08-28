/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Composite.controller;

/**
 *
 * @author USER
 */
abstract class Employee {
    String name = "not assinged yet";
    String title = "President";
    
    public void stateName(){
        System.out.println(title + " " + name);
    }
}
