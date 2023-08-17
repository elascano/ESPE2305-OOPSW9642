/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.contacts.view;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class ContactsSystem extends javax.swing.JFrame {

    /**
     * Creates new form ContactsSystem
     */
    public ContactsSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuManagement = new javax.swing.JMenuBar();
        mnuContacts = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuGo = new javax.swing.JMenuItem();
        mnuCall = new javax.swing.JMenu();
        mnuPhone = new javax.swing.JMenuItem();
        mnuWhatsapp = new javax.swing.JMenuItem();
        mnuMessenger = new javax.swing.JMenuItem();
        mnucontacts = new javax.swing.JMenuItem();
        mnuSettings = new javax.swing.JMenu();
        mnuModify = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuContacts.setText("Contacts");

        jMenu1.setText("Management");

        mnuGo.setText("Go");
        mnuGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGo);

        mnuContacts.add(jMenu1);

        mnuCall.setText("Call");

        mnuPhone.setText("phone");
        mnuCall.add(mnuPhone);

        mnuWhatsapp.setText("Whatsapp");
        mnuCall.add(mnuWhatsapp);

        mnuMessenger.setText("Messenger");
        mnuCall.add(mnuMessenger);

        mnuContacts.add(mnuCall);

        mnucontacts.setText("contacts");
        mnuContacts.add(mnucontacts);

        mnuManagement.add(mnuContacts);

        mnuSettings.setText("Settings");

        mnuModify.setText("modify");
        mnuSettings.add(mnuModify);

        mnuManagement.add(mnuSettings);

        mnuHelp.setText("Help");
        mnuManagement.add(mnuHelp);

        setJMenuBar(mnuManagement);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGoActionPerformed
        FrmContacts frmContacts = new FrmContacts();
        frmContacts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuGoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactsSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactsSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu mnuCall;
    private javax.swing.JMenu mnuContacts;
    private javax.swing.JMenuItem mnuGo;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuBar mnuManagement;
    private javax.swing.JMenuItem mnuMessenger;
    private javax.swing.JMenuItem mnuModify;
    private javax.swing.JMenuItem mnuPhone;
    private javax.swing.JMenu mnuSettings;
    private javax.swing.JMenuItem mnuWhatsapp;
    private javax.swing.JMenuItem mnucontacts;
    // End of variables declaration//GEN-END:variables
}