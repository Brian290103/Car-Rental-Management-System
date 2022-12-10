/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddAdmin extends javax.swing.JInternalFrame {
    CarRentals cr=new CarRentals();

    /**
     * Creates new form AddAdmin
     */
    public AddAdmin() {
        initComponents();
        
        txt_date.setText(cr.setDate() + " " + cr.setTime());
         rbtn_male.setSelected(true);
        rbtn_female.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_addEmp = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Register Admin");
        setMinimumSize(new java.awt.Dimension(571, 489));
        setPreferredSize(new java.awt.Dimension(571, 489));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel8.setText("Register Admin");
        jPanel2.add(jLabel8);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel8.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel3.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name:");
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel3);

        txt_name.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jPanel3.add(txt_name);

        jLabel4.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender:");
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel4);

        jPanel9.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        rbtn_male.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbtn_male.setText("Male");
        rbtn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_maleActionPerformed(evt);
            }
        });
        jPanel9.add(rbtn_male);

        rbtn_female.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbtn_female.setText("Female");
        rbtn_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_femaleActionPerformed(evt);
            }
        });
        jPanel9.add(rbtn_female);

        jPanel3.add(jPanel9);

        jLabel5.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone:");
        jLabel5.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel5);

        txt_phone.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txt_phone);

        jLabel10.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");
        jLabel10.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel10);

        txt_email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txt_email);

        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Address:");
        jLabel6.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel6);

        txt_address.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txt_address);

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Date of Reg:");
        jLabel7.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel7);

        txt_date.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(txt_date);

        jLabel9.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Username:");
        jLabel9.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel9);

        txt_username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txt_username);

        jLabel11.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Password:");
        jLabel11.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.add(jLabel11);

        txt_password.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txt_password);

        jPanel8.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel10.setPreferredSize(new java.awt.Dimension(100, 484));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel14.setPreferredSize(new java.awt.Dimension(20, 334));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        btn_addEmp.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        btn_addEmp.setText("Register");
        btn_addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addEmpActionPerformed(evt);
            }
        });
        jPanel5.add(btn_addEmp);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_maleActionPerformed
        // TODO add your handling code here:
        rbtn_male.setSelected(true);
        rbtn_female.setSelected(false);
    }//GEN-LAST:event_rbtn_maleActionPerformed

    private void rbtn_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_femaleActionPerformed
        // TODO add your handling code here:
        rbtn_male.setSelected(false);
        rbtn_female.setSelected(true);
    }//GEN-LAST:event_rbtn_femaleActionPerformed

    private void btn_addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addEmpActionPerformed
        // TODO add your handling code here:

        String name = txt_name.getText();
        String gender = null;

        if (rbtn_male.isSelected()) {
            gender = "M";
        } else if (rbtn_female.isSelected()) {
            gender = "F";
        }

        String phone = txt_phone.getText();
        String email = txt_email.getText();
        String address = txt_address.getText();
        String date = cr.setDate() + " " + cr.setTime();
        String username = txt_username.getText();
        String password = txt_password.getText();

        if (name.equals("") || phone.equals("") || email.equals("") || address.equals("") || username.equals("") || password == null) {
            JOptionPane.showMessageDialog(this, "One of the Fields is empty", "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            cr.addAdmin(name, gender, phone, email, address, date, username, password);
            reset();
        }
        this.dispose();

    }//GEN-LAST:event_btn_addEmpActionPerformed

   void reset() {
        txt_name.setText("");
        rbtn_male.setSelected(true);
        rbtn_female.setSelected(false);
        txt_phone.setText("");
        txt_email.setText("");
        txt_address.setText("");
        txt_date.setText("");
        txt_username.setText("");
        txt_password.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addEmp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextField txt_address;
    private javax.swing.JLabel txt_date;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}