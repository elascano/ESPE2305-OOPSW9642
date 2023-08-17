package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.SmartWatch;
import ec.edu.espe.exam.utils.DatabaseManager;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class ViewController {
    SWManage SWController;
    
    private static ViewController instance;
    
    private ViewController() {
        this.SWController = SWController.getInstance();
    }
    
    public synchronized static ViewController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new ViewController();
        }
        
        return instance;
    }
    
    public void displayTable(JTable tbl){
        ArrayList<SmartWatch> smartWatchs = SWController.obtainAll();
        
        DefaultTableModel inventoryTableModel = writeTable(smartWatchs, tbl);
        tbl.setModel(inventoryTableModel);
        tbl.setDefaultEditor(Object.class, null);
    }
    
    public static DefaultTableModel writeTable(ArrayList<SmartWatch> smartWatchs, JTable tbl) {
        DefaultTableModel inventoryTableModel = new DefaultTableModel();
        
        Object[] smartWatchData = new Object[tbl.getColumnCount()];
        
        String[] header = {"Id","Brand","Color","Price"};
        
        inventoryTableModel.setColumnIdentifiers(header);
        
        for(SmartWatch smartWatch: smartWatchs){
            
            smartWatchData[0] = smartWatch.getId();
            smartWatchData[1]= smartWatch.getBrand();
            smartWatchData[2] = smartWatch.getColor();
            smartWatchData[3] = smartWatch.getPrice();
            
            inventoryTableModel.addRow(smartWatchData);
            
        }
        
        return inventoryTableModel;
    }
    
    
}
