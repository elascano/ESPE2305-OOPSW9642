package ec.edu.espe.clientapp.model;

import javax.swing.JMenu;
import javax.swing.JPanel;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class WinMenu extends Menu {
    @Override
    public void paint(JPanel panel){
        JMenu menu = new JMenu("I'm a WinMenu: " + caption);
        panel.add(menu);
    }
}
