/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.Thefamse.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author The FAMSE
 */
public class Report {
    public static void generateReportJSON(List<NutCustomer> customers) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (NutCustomer customer : customers) {
            String json = gson.toJson(customer);
            try (FileWriter writer = new FileWriter(customer.getName() + ".json")) {
                writer.write(json);
                System.out.println("Reporte generado del cliente: " + customer.getName());
            } catch (IOException e) {
                System.out.println("Error al generar el reporte del cliente: " + customer.getName());
                e.printStackTrace();
            }
        }
    }
}
