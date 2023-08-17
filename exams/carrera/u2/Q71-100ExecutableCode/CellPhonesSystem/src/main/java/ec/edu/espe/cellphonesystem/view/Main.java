/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cellphonesystem.view;

import com.mongodb.client.MongoClient;
import ec.edu.espe.cellphonesystem.utils.DbConnectionManager;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        DbConnectionManager dbConnectionManager = new DbConnectionManager();
        MongoClient client = dbConnectionManager.connectDb();
        FrmInsertCellphone frmInsertCellphone = new FrmInsertCellphone(client);
        frmInsertCellphone.setVisible(true);
        frmInsertCellphone.setLocationRelativeTo(null);
        
    }
}
