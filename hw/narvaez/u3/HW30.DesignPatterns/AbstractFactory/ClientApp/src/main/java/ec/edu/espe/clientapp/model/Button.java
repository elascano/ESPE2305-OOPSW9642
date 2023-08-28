package ec.edu.espe.clientapp.model;

import javax.swing.JPanel;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public abstract class Button {
    public String caption;
    public abstract void paint(JPanel panel);
}
