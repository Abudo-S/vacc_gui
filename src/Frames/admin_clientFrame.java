/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Framespanels.client_Addpanel;
import Framespanels.client_Listpanel;
import Framespanels.client_Updatepanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author abudo
 */
public class admin_clientFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form admin_clientFrame
     */
    client_Addpanel p1;
    client_Listpanel p2;
    client_Updatepanel p3;
        GridBagLayout layout =new GridBagLayout();
    public admin_clientFrame() {
        initComponents();
        p1=new client_Addpanel();
         p2=new client_Listpanel();
         p3=new client_Updatepanel();
         Dynamicpanel.setLayout(layout);
         GridBagConstraints c=new  GridBagConstraints();
         c.gridx=0;
         c.gridy=0;
         Dynamicpanel.add(p1,c);
         Dynamicpanel.add(p2,c);
         Dynamicpanel.add(p3,c);
      p1.setVisible(true);
       p2.setVisible(false);
        p3.setVisible(false);
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
        jButtonAdd = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        Dynamicpanel = new javax.swing.JPanel();

        jButtonAdd.setText("Add client");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonList.setText("List clients");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update-Delete");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonList, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButtonAdd)
                .addGap(48, 48, 48)
                .addComponent(jButtonList)
                .addGap(53, 53, 53)
                .addComponent(jButtonUpdate)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout DynamicpanelLayout = new javax.swing.GroupLayout(Dynamicpanel);
        Dynamicpanel.setLayout(DynamicpanelLayout);
        DynamicpanelLayout.setHorizontalGroup(
            DynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        DynamicpanelLayout.setVerticalGroup(
            DynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(Dynamicpanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
          p1.setVisible(false);
       p2.setVisible(false);
        p3.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
       p2.setVisible(true);
        p3.setVisible(false);
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
          p1.setVisible(true);
          p2.setVisible(false);
          p3.setVisible(false);
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dynamicpanel;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}