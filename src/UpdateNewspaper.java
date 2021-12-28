
import Project.ConnectionProvider;
import java.awt.Color;
import static java.lang.Character.isDigit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class UpdateNewspaper extends javax.swing.JFrame {

    /**
     * Creates new form UpdateNewspaper
     */
    public UpdateNewspaper() {
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

        jLabel1 = new javax.swing.JLabel();
        updateNewspaperIconLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        contactNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        newspaperIDTextField = new javax.swing.JTextField();
        newspaperDescriptionTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        newspaperNameTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        productStatusComboBox = new javax.swing.JComboBox<>();
        contactNumberFormLabel1 = new javax.swing.JLabel();
        weekdayRateTextField = new javax.swing.JTextField();
        contactNumberFormLabel2 = new javax.swing.JLabel();
        sundayRateTextField = new javax.swing.JTextField();
        contactNumberFormLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 190));
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Update Newspaper");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        updateNewspaperIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update_product.png"))); // NOI18N
        getContentPane().add(updateNewspaperIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 610, 10));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 610, 20));

        contactNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberLabel.setText("Newspaper ID");
        getContentPane().add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 20));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Description");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 20));

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderLabel.setText("Product Status");
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, 20));

        newspaperIDTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newspaperIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newspaperIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(newspaperIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, -1));

        newspaperDescriptionTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newspaperDescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newspaperDescriptionTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(newspaperDescriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 250, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 640, 10));

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update_icon.png"))); // NOI18N
        updateButton.setText("  Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, 50));

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset_icon.png"))); // NOI18N
        resetButton.setText("  Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 140, 50));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_icon.png"))); // NOI18N
        cancelButton.setText("  Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 130, 50));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Newspaper Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 20));

        newspaperNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newspaperNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newspaperNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(newspaperNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 250, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 610, 20));

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_icon.png"))); // NOI18N
        searchButton.setText("  Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 130, 40));

        productStatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        productStatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productStatusComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(productStatusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 250, -1));

        contactNumberFormLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberFormLabel1.setText("Sunday Rate                    (Rs.)");
        getContentPane().add(contactNumberFormLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 20));

        weekdayRateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weekdayRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekdayRateTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(weekdayRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 200, -1));

        contactNumberFormLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberFormLabel2.setText(" ");
        getContentPane().add(contactNumberFormLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 20));

        sundayRateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sundayRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundayRateTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(sundayRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 200, -1));

        contactNumberFormLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberFormLabel3.setText("Weekdays Rate               (Rs.)");
        getContentPane().add(contactNumberFormLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 640, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newspaperIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newspaperIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newspaperIDTextFieldActionPerformed

    private void newspaperDescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newspaperDescriptionTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_newspaperDescriptionTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        String newspaperIDSearch = newspaperIDTextField.getText();
        String newspaperName = newspaperNameTextField.getText();
        String newspaperWeekdayRate = weekdayRateTextField.getText();
        String newspaperSundayRate = sundayRateTextField.getText();
        String newspaperDescription = newspaperDescriptionTextField.getText();
        String newspaperActivationStatus = (String)productStatusComboBox.getSelectedItem();

        try
        {
            //Check if all fields are filled
            if(newspaperName.equals("") || newspaperWeekdayRate.equals("") || newspaperSundayRate.equals(""))
            {
                throw new NullFieldException();
            }

            /*//Check if contact number is in digits
            for(int i=0; i < custContactNo.length(); i++)
            {
                if(!(isDigit(custContactNo.charAt(i))))
                {
                    throw new ContactNumberException();
                }
            }*/

            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            st.executeUpdate("update Newspaper set news_name='"+newspaperName+"', news_weekday_rate='"+newspaperWeekdayRate+"', news_sunday_rate='"+newspaperSundayRate+"', news_description='"+newspaperDescription+"', news_activation_status='"+newspaperActivationStatus+"' where news_id='"+newspaperIDSearch+"'");

            //Update in customer_newspaper (fk) table
            st.executeUpdate("update customer_newspaper set news_name='"+newspaperName+"'");

            JOptionPane.showMessageDialog(null, "Successfully Updated");

            setVisible(false);
            new UpdateNewspaper().setVisible(true);
        }

        //Fields are null
        catch(NullFieldException e)
        {
            //new NullFieldException();
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }

       
        catch(SQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(null,"Customer with this Contact No. already exists. Please add another Contact Number");
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateNewspaper().setVisible(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void newspaperNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newspaperNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newspaperNameTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:

        String newspaperID = newspaperIDTextField.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Newspaper where news_id='"+newspaperID+"'");

            if(rs.next())
            {
                //Search and get all the details from customer table then put them on the text fields
                //(1) is newsID
                newspaperNameTextField.setText(rs.getString(2));
                weekdayRateTextField.setText(rs.getString(3));
                sundayRateTextField.setText(rs.getString(4));
                newspaperDescriptionTextField.setText(rs.getString(5));
                productStatusComboBox.setSelectedItem(rs.getString(6));

                newspaperIDTextField.setEditable(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Newspaper ID Does not Exist");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void weekdayRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekdayRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weekdayRateTextFieldActionPerformed

    private void sundayRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundayRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sundayRateTextFieldActionPerformed

    private void productStatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productStatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productStatusComboBoxActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(UpdateNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNewspaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel contactNumberFormLabel1;
    private javax.swing.JLabel contactNumberFormLabel2;
    private javax.swing.JLabel contactNumberFormLabel3;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField newspaperDescriptionTextField;
    private javax.swing.JTextField newspaperIDTextField;
    private javax.swing.JTextField newspaperNameTextField;
    private javax.swing.JComboBox<String> productStatusComboBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField sundayRateTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateNewspaperIconLabel;
    private javax.swing.JTextField weekdayRateTextField;
    // End of variables declaration//GEN-END:variables
}
