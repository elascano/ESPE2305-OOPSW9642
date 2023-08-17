/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.utils;

/**
 *
 * @author Alexander Jumbo
 */
public class MongoDBConection {
        public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://AlexanderJ:AlexanderJumbo@cluster0.8wf62hq.mongodb.net/";
        String db = "Sort";
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }
}
