
import javax.swing.JTable;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class NewspaperDetails extends javax.swing.JFrame {

    /**
     * Creates new form NewspaperDetails
     */
    public NewspaperDetails() {
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

        newspaperDetailsLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        newspaperDetailsTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        clsoeButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        newspaperDetailsIconLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 190));
        setMaximumSize(new java.awt.Dimension(1005, 555));
        setMinimumSize(new java.awt.Dimension(1005, 555));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1005, 555));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newspaperDetailsLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        newspaperDetailsLabel.setText("Newspaper Details");
        getContentPane().add(newspaperDetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 980, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 10));

        newspaperDetailsTable.setBorder(new javax.swing.border.MatteBorder(null));
        newspaperDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newspaperDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null", "Title 5"
            }
        ));
        newspaperDetailsTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newspaperDetailsTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(newspaperDetailsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 980, 280));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print_icon.png"))); // NOI18N
        printButton.setText("  Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 130, 40));

        clsoeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clsoeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_icon.png"))); // NOI18N
        clsoeButton.setText("  Close");
        clsoeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsoeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clsoeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 130, 40));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 970, 10));

        newspaperDetailsIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product_details.png"))); // NOI18N
        getContentPane().add(newspaperDetailsIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh_icon.png"))); // NOI18N
        refreshButton.setText(" Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newspaperDetailsTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newspaperDetailsTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_newspaperDetailsTableFocusGained

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:

        try
        {
            newspaperDetailsTable.print(JTable.PrintMode.FIT_WIDTH);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void clsoeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsoeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_clsoeButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from Newspaper");
            
            newspaperDetailsTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new NewspaperDetails().setVisible(true);
        //System.exit(0);
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewspaperDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewspaperDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewspaperDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewspaperDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewspaperDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clsoeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel newspaperDetailsIconLabel;
    private javax.swing.JLabel newspaperDetailsLabel;
    private javax.swing.JTable newspaperDetailsTable;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}