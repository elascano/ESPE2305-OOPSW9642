package ec.edu.espe.sortingapp.view;

import ec.edu.espe.sortingapp.utils.DbConnectionManager;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        DbConnectionManager dbConnectionManager = DbConnectionManager.getInstance();
        dbConnectionManager.connectDb();
        
        FrmSort frmSort = new FrmSort();
        frmSort.setVisible(true);
    }
}
