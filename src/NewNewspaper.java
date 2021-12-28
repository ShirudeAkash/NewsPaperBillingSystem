import java.awt.Color;
import Project.ConnectionProvider;
import java.awt.HeadlessException;
import static java.lang.Character.isDigit;
import java.sql.*;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class NewNewspaper extends javax.swing.JFrame {

    /**
     * Creates new form NewNewspaper
     */
    public NewNewspaper() {
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

        newNewspaperHeadingLabel = new javax.swing.JLabel();
        newNewspaperIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        productIDLabel = new javax.swing.JLabel();
        newsIDNumberLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        sundayRateTextField = new javax.swing.JTextField();
        sundayRateLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        weekdayRateLabel = new javax.swing.JLabel();
        weekdayRateTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        activateLabel = new javax.swing.JLabel();
        activateComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 190));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setUndecorated(true);
        setResizable(false);
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

        newNewspaperHeadingLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        newNewspaperHeadingLabel.setText("New Newspaper");
        getContentPane().add(newNewspaperHeadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        newNewspaperIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_newspaper.png"))); // NOI18N
        getContentPane().add(newNewspaperIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, 60));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 610, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 640, 10));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_icon.png"))); // NOI18N
        saveButton.setText("  Save");
        saveButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                saveButtonComponentShown(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 110, 50));

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset_icon.png"))); // NOI18N
        resetButton.setText("  Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 50));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_icon.png"))); // NOI18N
        cancelButton.setText("  Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 120, 50));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 610, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 640, 10));

        productIDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productIDLabel.setText("Newspaper ID");
        getContentPane().add(productIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        newsIDNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newsIDNumberLabel.setForeground(new java.awt.Color(255, 51, 0));
        newsIDNumberLabel.setText("21");
        getContentPane().add(newsIDNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 142, -1, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 610, 20));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Newspaper Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        sundayRateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sundayRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundayRateTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(sundayRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 240, -1));

        sundayRateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sundayRateLabel.setText("Sunday Rate");
        getContentPane().add(sundayRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 240, -1));

        weekdayRateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        weekdayRateLabel.setText("Weekday Rate");
        getContentPane().add(weekdayRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        weekdayRateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weekdayRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekdayRateTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(weekdayRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 240, -1));

        descriptionTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 240, -1));

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descriptionLabel.setText("Description");
        getContentPane().add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        activateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        activateLabel.setText("Product Status");
        getContentPane().add(activateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        activateComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        activateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inavtive" }));
        getContentPane().add(activateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        String newsID = newsIDNumberLabel.getText();
        String newsName = nameTextField.getText();
        String newsWeekdayRate = weekdayRateTextField.getText();
        String newsSundayRate = sundayRateTextField.getText();
        String newsDescription = descriptionTextField.getText();
        String newsActivate = (String)activateComboBox.getSelectedItem();

        try
        {
            //Check if all fields are filled
            if(newsName.equals("") || newsWeekdayRate.equals("") || newsSundayRate.equals(""))
            {
                throw new NullFieldException();
            }

            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into Newspaper values ('"+newsID+"','"+newsName+"','"+newsWeekdayRate+"','"+newsSundayRate+"','"+newsDescription+"','"+newsActivate+"')");
            //String query = "insert into Customer "+"values ("

            /*
            //the mysql insert statement
            String query = " insert into Customer (cust_name, cust_contact_no, cust_email, cust_address, cust_gender)"
            + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, custName);
            preparedStmt.setString(2, custContactNo);
            preparedStmt.setString(3, custEmail);
            preparedStmt.setString(4, custAddress);
            preparedStmt.setString(5, custGender);

            // execute the preparedstatement
            preparedStmt.execute();

            con.close();
            */

            JOptionPane.showMessageDialog(null, "Successfully Added Newspaper Details");
            setVisible(false);
            new NewNewspaper().setVisible(true);

        }

        //Fields are null
        catch(NullFieldException e)
        {
            //new NullFieldException();
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        }

        //Any other Exceotion
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NewNewspaper().setVisible(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void sundayRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundayRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sundayRateTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void weekdayRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekdayRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weekdayRateTextFieldActionPerformed

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextFieldActionPerformed

    private void saveButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_saveButtonComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select max(news_id) from Newspaper");
            if(rs.next())  //first as it would be possible there is not value present
            {
                int news_id = rs.getInt(1);
                news_id = news_id + 1;
                
                String str = String.valueOf(news_id);
                newsIDNumberLabel.setText(str);
            }
            else
            {
                System.out.println("HERE ELSE");
                newsIDNumberLabel.setText("1");
            }
        }
        catch(Exception e)
        {
            System.out.println("HERE");
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(NewNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewNewspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewNewspaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activateComboBox;
    private javax.swing.JLabel activateLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel newNewspaperHeadingLabel;
    private javax.swing.JLabel newNewspaperIcon;
    private javax.swing.JLabel newsIDNumberLabel;
    private javax.swing.JLabel productIDLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sundayRateLabel;
    private javax.swing.JTextField sundayRateTextField;
    private javax.swing.JLabel weekdayRateLabel;
    private javax.swing.JTextField weekdayRateTextField;
    // End of variables declaration//GEN-END:variables
}
