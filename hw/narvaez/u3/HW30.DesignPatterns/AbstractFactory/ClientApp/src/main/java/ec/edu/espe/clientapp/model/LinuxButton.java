package ec.edu.espe.clientapp.model;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCC0-ESPE
 */
public class LinuxButton extends Button{

    @Override
    public void paint(JPanel panel) {
        JButton button = new JButton("I'm a LinuxButton: " + caption);
        panel.add(button);
    }
    
}
