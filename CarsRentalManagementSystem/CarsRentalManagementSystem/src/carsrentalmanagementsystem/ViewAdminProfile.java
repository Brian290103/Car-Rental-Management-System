/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ViewAdminProfile extends javax.swing.JInternalFrame {

    static String username;
    String query;

    /**
     * Creates new form ViewMyProfile
     */
    public ViewAdminProfile() {
        initComponents();
        username =  AdminDashboard.txt_username.getText();

        genMyProfile();
    }

    void genMyProfile() {
        String gender = null;

        query = "SELECT `emp_id`, `name`, `gender`, `phone`, `email`, `address`, `date`, `username`, `password` FROM `admin` WHERE `emp_id`=?";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrentalmanagementsystem", "root", "");
            PreparedStatement pst = con.prepareStatement(query);
            try {
                pst.setString(1, this.username);

                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    txt_idNo.setText(rs.getString(1));
                    txt_name.setText(rs.getString(2));
                    gender = rs.getString(3);

                    if (gender.equals("M")) {
                        rbtn_male.setSelected(true);
                    } else if (gender.equals("F")) {
                        rbtn_female.setSelected(true);
                    }

                    txt_phone.setText(rs.getString(4));
                    txt_email.setText(rs.getString(5));
                    txt_address.setText(rs.getString(6));
                    txt_date.setText(rs.getString(7));
                    txt_username.setText(rs.getString(8));
                    txt_password.setText(rs.getString(9));
                }

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAdminProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_label1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_idNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manage Employee Profile");
        setMinimumSize(new java.awt.Dimension(502, 497));
        setPreferredSize(new java.awt.Dimension(502, 497));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel1.setText("Manage my Profile");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 256));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        txt_label1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_label1.setText("Manage my Profile");
        jPanel3.add(txt_label1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 256));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel11.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Id Number:");
        jPanel5.add(jLabel11);

        txt_idNo.setEditable(false);
        txt_idNo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_idNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idNoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_idNo);

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name:");
        jPanel5.add(jLabel3);

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel5.add(txt_name);

        jLabel4.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender:");
        jPanel5.add(jLabel4);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        rbtn_male.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbtn_male.setText("Male");
        rbtn_male.setEnabled(false);
        jPanel9.add(rbtn_male);

        rbtn_female.setText("Female");
        rbtn_female.setEnabled(false);
        jPanel9.add(rbtn_female);

        jPanel5.add(jPanel9);

        jLabel5.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone Number:");
        jPanel5.add(jLabel5);

        txt_phone.setEditable(false);
        txt_phone.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jPanel5.add(txt_phone);

        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email Address:");
        jPanel5.add(jLabel6);

        txt_email.setEditable(false);
        txt_email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel5.add(txt_email);

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address:");
        jPanel5.add(jLabel7);

        txt_address.setEditable(false);
        txt_address.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        jPanel5.add(txt_address);

        jLabel8.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date of Registration:");
        jPanel5.add(jLabel8);

        txt_date.setEditable(false);
        txt_date.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });
        jPanel5.add(txt_date);

        jLabel9.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Username:");
        jPanel5.add(jLabel9);

        txt_username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel5.add(txt_username);

        jLabel10.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Password:");
        jPanel5.add(jLabel10);

        txt_password.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel5.add(txt_password);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);

        btn_update.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.setToolTipText("Inorder to make more changes, Contact your Admin!");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel7.add(btn_update);

        jPanel5.add(jPanel7);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_idNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idNoActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "Are you sure you want to update the record?")) {

            query = "UPDATE `admin` SET `username`=?,`password`=? WHERE `emp_id`=?";
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrentalmanagementsystem", "root", "");
                PreparedStatement pst = con.prepareStatement(query);
                try {
                    pst.setString(1, txt_username.getText());
                    pst.setString(2, txt_password.getText());

                    pst.setString(3, txt_idNo.getText());

                    pst.executeUpdate();
                    con.close();

                    JOptionPane.showMessageDialog(this, "Record Updated");
                    this.dispose();

//                     new AdminLogin().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            } catch (Exception ex) {
                Logger.getLogger(ViewAdminProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_idNo;
    private javax.swing.JLabel txt_label1;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
