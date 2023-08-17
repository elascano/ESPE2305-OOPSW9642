/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.controller;


import ec.edu.espe.strategy.view.FrmSortApp;
import utils.DBManager;

/**
 *
 * @author Carlos Jaya,Software Juniors, DCOO-ESPE
 */
public class FrmSortAppController {
    public static DBManager connectMongo(DBManager dBManager) {
        dBManager = new DBManager();
        dBManager.connect("mongodb+srv://cajaya1:cajaya1@cluster0.dl7289k.mongodb.net/", "strategyJaya");
        

        return dBManager;
    }
    
    public static void sortArray(FrmSortApp frmSortApp) {
        String arrayString;
        SortingContext sortingContext;
        StrategyArray strategyArray;
        
        int[] unsorted;
        int[] sorted;
        String algorithm;
        
        sortingContext = new SortingContext();
        
        arrayString = frmSortApp.getTxtArray().getText();
        unsorted = getArray(arrayString);
        sorted = unsorted.clone();
        
        algorithm = sortingContext.sort(sorted);
        
        strategyArray = new StrategyArray(unsorted, unsorted.length, algorithm, sorted);
        
        frmSortApp.getdBManager().createDocument("arrayCarlos", strategyArray.toGson());
    }
    
    public static int[] getArray(String numbers) {
        String[] Array = numbers.split(",");
        int[] newArray = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            newArray[i] = Integer.parseInt(Array[i]);
        }
        return newArray;
    }
}
