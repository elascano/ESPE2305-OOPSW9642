/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.view;
import java.util.Scanner;
import ec.espe.edu.model.Velocity;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Anabel Davila, killChainTeam, DCCO-ESPE
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance, time;
        System.out.println("Ingrese la distancia recorrida en kilómetros: ");
        distance = scanner.nextDouble();
        System.out.println("Ingrese el tiempo que tardó en recorrer la distancia en horas: ");
        time = scanner.nextDouble();
        Vehicle vehicle = new Vehicle(distance, time);
        double velocity = vehicle.calculateVelocity();
        System.out.println("La velocidad del vehículo fue de " + velocity + " km/h");
    String fileName = "Datos.csv";
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(distance + "," + time + "," + velocity);
        writer.newLine();
        writer.close();
    } catch(IOException e) {
        System.err.println("Error al escribir en archivo: " + e);
        }
    }
}
