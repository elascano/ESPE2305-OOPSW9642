/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.strategy.model;

/**
 *
 * @author USER
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int data [] = {3,6,4,6,7,8,5,6,7,5,3,3,1,2,3,4,1,2,3,2,1,2,10,3,};
     SortingContext sc = new SortingContext();
     int sortedList[] = sc.sort(data);
    }    
}
