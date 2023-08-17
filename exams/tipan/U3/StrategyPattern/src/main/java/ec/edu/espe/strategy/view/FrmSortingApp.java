
package ec.edu.espe.strategy.view;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import static ec.edu.espe.strategy.controller.SortController.addSortCase;
import ec.edu.espe.strategy.model.BubbleSort;
import ec.edu.espe.strategy.model.InsertionSort;
import ec.edu.espe.strategy.model.QuickSort;
import ec.edu.espe.strategy.model.SortingContext;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Leonel Tipan, Code Warriors, DCCO-ESPE
 */
public class FrmSortingApp extends javax.swing.JFrame {

    /**
     * Creates new form FrmSortingApp
     */
    public FrmSortingApp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntryNums = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSortNums = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        brnClean = new javax.swing.JButton();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Leonel's Sort Numbers Program");

        jLabel2.setText("Insert the list of numbers to sort separated by a acomma (Ex: 6,5,4,7,8):");

        txtEntryNums.setColumns(20);
        txtEntryNums.setRows(5);
        txtEntryNums.setToolTipText("");
        txtEntryNums.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntryNumsKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtEntryNums);

        txtSortNums.setColumns(20);
        txtSortNums.setRows(5);
        jScrollPane2.setViewportView(txtSortNums);

        jLabel3.setText("Sorted list:");

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        brnClean.setText("Clean");
        brnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(brnClean)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort)
                    .addComponent(brnClean))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntryNumsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntryNumsKeyTyped
        char character = evt.getKeyChar();

        if (!Character.isDigit(character) && character != 44 && (character != KeyEvent.VK_BACK_SPACE) && (character != KeyEvent.VK_DELETE) && (character != KeyEvent.VK_SPACE) && (character != KeyEvent.VK_ENTER)) {
            JOptionPane.showMessageDialog(this, character + " Is not accepted", "Data entry warning", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtEntryNumsKeyTyped

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        String[] numberInput = txtEntryNums.getText().split(",");
        int[] insertedData = new int[numberInput.length];
        for (int i = 0; i < numberInput.length; i++) {
            insertedData[i] = Integer.parseInt(numberInput[i].trim());
        }

        SortingContext context = new SortingContext();
        int[] sortedNumbers = context.sort(insertedData);

        txtSortNums.setText(Arrays.toString(sortedNumbers));

        String sortStrategy;

        ArrayList<Integer> sortArr = new ArrayList<>();

        for (int i = 0; i < sortedNumbers.length; i++) {
            sortArr.add(sortedNumbers[i]);
        }
        if (insertedData.length >= 2 && insertedData.length <= 5) {
            context.setSortStrategy(new BubbleSort());
            sortStrategy = "BubbleSort";
        } else if (insertedData.length >= 6 && insertedData.length <= 10) {
            context.setSortStrategy(new InsertionSort());
            sortStrategy = "InsertionSort";
        } else {
            context.setSortStrategy(new QuickSort());
            sortStrategy = "QuickSort";
    }

        Document sortDocument = new Document().append("_id", new ObjectId())
                .append("unsorted", txtEntryNums.getText())
                .append("size", insertedData.length)
                .append("sortAlgorithm", sortStrategy)
                .append("sorted", sortArr.toString());

        addSortCase(sortDocument);
    }//GEN-LAST:event_btnSortActionPerformed

    private void brnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCleanActionPerformed
        txtSortNums.setText("");
        txtEntryNums.setText("");
    }//GEN-LAST:event_brnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatMaterialLighterIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSortingApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnClean;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEntryNums;
    private javax.swing.JTextArea txtSortNums;
    // End of variables declaration//GEN-END:variables
}
