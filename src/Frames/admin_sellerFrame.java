/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;
import vacc.*;

/**
 *
 * @author abudo
 */
public class admin_sellerFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form admin_sellerFrame
     */
    admin ad=new admin();
    vacc_center v=new vacc_center();
    public admin_sellerFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldfname = new javax.swing.JTextField();
        jTextFieldlname = new javax.swing.JTextField();
        jTextFieldid = new javax.swing.JTextField();
        jTextFieldage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("ID");

        jLabel4.setText("Age");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfnameActionPerformed(evt);
            }
        });

        jTextFieldlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlnameActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jTextFieldfname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldemail))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
         if (!jTextFieldfname.getText().equals("") && !jTextFieldfname.getText().equals("") && !jTextFieldlname.getText().equals("") && !jTextFieldage.getText().equals("") && !jTextFieldemail.getText().equals("") ) {

            seller x = new seller();
            x.set_id(Integer.parseInt(jTextFieldid.getText()));
            x.set_fname(jTextFieldfname.getText());
            x.set_lname(jTextFieldlname.getText());                 
            x.set_age(Integer.parseInt(jTextFieldage.getText()));            
            x.set_email(jTextFieldemail.getText());
            if (ad.add_seller(x,v)) {
                jLabelSucessOrFail.setText("Added Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to insert ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
protected void resetPanelData() {
        jTextFieldid.setText("");
        jTextFieldfname.setText("");
        jTextFieldlname.setText("");
        jTextFieldemail.setText("");       
        jTextFieldage.setText("");

    }
    private void jTextFieldlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JTextField jTextFieldage;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfname;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldlname;
    // End of variables declaration//GEN-END:variables
}
