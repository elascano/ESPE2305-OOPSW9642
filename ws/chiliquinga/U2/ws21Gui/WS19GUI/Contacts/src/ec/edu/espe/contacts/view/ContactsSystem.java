/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.contacts.view;

/**
 *
 * @author yeshualinux
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmManagement = new javax.swing.JMenu();
        itmGo = new javax.swing.JMenuItem();
        itmContacts = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itmPhone = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        itmMessenger = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmModify = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Contacts");

        itmManagement.setText("Management");

        itmGo.setText("Go");
        itmGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGoActionPerformed(evt);
            }
        });
        itmManagement.add(itmGo);

        jMenu1.add(itmManagement);

        itmContacts.setText("Contacts");
        itmContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContactsActionPerformed(evt);
            }
        });
        jMenu1.add(itmContacts);

        jMenu5.setText("Call");

        itmPhone.setText("phone");
        itmPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPhoneActionPerformed(evt);
            }
        });
        jMenu5.add(itmPhone);

        jMenuItem1.setText("WhatsApp");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        itmMessenger.setText("Messenger");
        jMenu5.add(itmMessenger);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");

        itmModify.setText("modify");
        itmModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmModifyActionPerformed(evt);
            }
        });
        jMenu2.add(itmModify);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmModifyActionPerformed

    private void itmContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContactsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmContactsActionPerformed

    private void itmPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmPhoneActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGoActionPerformed
        // TODO add your handling code here:
        FrmContacts frmContacts = new FrmContacts();
        this.setVisible(false);
        frmContacts.setVisible(true);
        
    }//GEN-LAST:event_itmGoActionPerformed

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
    private javax.swing.JMenuItem itmContacts;
    private javax.swing.JMenuItem itmGo;
    private javax.swing.JMenu itmManagement;
    private javax.swing.JMenuItem itmMessenger;
    private javax.swing.JMenuItem itmModify;
    private javax.swing.JMenuItem itmPhone;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}