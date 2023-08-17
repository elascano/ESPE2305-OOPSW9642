package ec.edu.espe.exam.controller;


import ec.edu.espe.exam.model.Country;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class ViewController {
    CountryController countryController;
    
    private static ViewController instance;
    
    private ViewController() {
        this.countryController = CountryController.getInstance();
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
        ArrayList<Country> countrys = countryController.obtainAll();
        
        DefaultTableModel inventoryTableModel = writeTable(countrys, tbl);
        tbl.setModel(inventoryTableModel);
        tbl.setDefaultEditor(Object.class, null);
    }
    
    public DefaultTableModel writeTable(ArrayList<Country> countrys, JTable tbl) {
        DefaultTableModel inventoryTableModel = new DefaultTableModel();
        
        Object[] countryData = new Object[tbl.getColumnCount()];
        
        String[] header = {"ID","Name","Population", "AVG Salary", "TotalMoneyPerMonth"};
        
        inventoryTableModel.setColumnIdentifiers(header);
        
        for(Country country: countrys){
            
            countryData[0] = country.getId();
            countryData[1]= country.getName();
            countryData[2] = country.getPopulation();
            countryData[3] = country.getAverageSalary();
            countryData[4] = countryController.getAproximatedMoneyInCountry(country);
            
            inventoryTableModel.addRow(countryData);
            
        }
        
        return inventoryTableModel;
    }
    
    public static void activateBtn(JButton btn) {
        btn.setEnabled(true);
    }
    
    
}
