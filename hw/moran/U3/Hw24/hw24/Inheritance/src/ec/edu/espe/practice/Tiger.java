/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.practice;

/**
 *
 * @author Moran David
 */

abstract class Mammal{
    public abstract void feed();
    
}
public class Tiger extends Mammal {
    public void feed(){
        System.out.println("hola :D");
    }

}
