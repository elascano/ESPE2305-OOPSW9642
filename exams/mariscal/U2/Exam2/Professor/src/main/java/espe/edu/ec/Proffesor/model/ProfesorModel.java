/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.Proffesor.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import javax.swing.text.Document;
import org.bson.conversions.Bson;





/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class ProfesorModel {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<org.bson.Document> collection;

    public ProfesorModel() {
        mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://mesiasv25:12345@cluster0.txcolcw.mongodb.net/"));
        database = mongoClient.getDatabase("Exam");

        collection = database.getCollection("Professor");
    }
    
     public void actualizarSalario(int id, double nuevoSalario) {
        // Crear el filtro y la declaración de actualización
        Bson filter = Filters.eq("Id", id);
        Bson update = Updates.set("Salary", nuevoSalario);

        // Realizar la actualización
        UpdateResult result = collection.updateOne(filter, update);
    }

    public ArrayList<Profesor> obtenerProfesores() {
        ArrayList<Profesor> profesores = new ArrayList<>();

        // Realizar la consulta
        FindIterable<org.bson.Document> documents = collection.find();

        // Crear objetos Profesor a partir de los documentos
        for (org.bson.Document document : documents) {
            int id = document.getInteger("Id");
            String nombre = document.getString("name");
            double salario = document.getDouble("Salary");

            Profesor profesor = new Profesor(id, nombre, salario);
            profesores.add(profesor);
        }

        return profesores;
    }
      
}
