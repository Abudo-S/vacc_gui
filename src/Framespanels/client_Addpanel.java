 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framespanels;

import javax.swing.JOptionPane;
import vacc.*;

/**
 *
 * @author abudo
 */
public class client_Addpanel extends javax.swing.JPanel {

    /**
     * Creates new form client_Addpanel
     */
    admin ad=new admin();
    exceptionrule ex=new exceptionrule();
    public client_Addpanel() {
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
        jTextFieldfname = new javax.swing.JTextField();
        jTextFieldlname = new javax.swing.JTextField();
        jTextFieldage = new javax.swing.JTextField();
        jTextFieldid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Age");

        jLabel4.setText("ID");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldlname)
                            .addComponent(jTextFieldid)
                            .addComponent(jTextFieldage)
                            .addComponent(jTextFieldemail)
                            .addComponent(jButton1)
                            .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
         if (!jTextFieldid.getText().equals("") && !jTextFieldfname.getText().equals("") && !jTextFieldlname.getText().equals("") && !jTextFieldemail.getText().equals("") && !jTextFieldage.getText().equals("")) {
            client x = new client();
            x.loadFromFile();
            int age,id;
            String email;
            
           // x.set_id(Integer.parseInt(jTextFieldid.getText()));
              id=Integer.parseInt(jTextFieldid.getText());
            for(int i=0;i<x.clients.size();i++)
            {
                if(x.clients.get(i).get_id()==id||id<=0){
                    id=ex.check_id(x);
                }
            }
            x.set_id(id);
            x.set_fname(jTextFieldfname.getText());
            x.set_lname(jTextFieldlname.getText());
           // x.set_email(jTextFieldemail.getText());      
           // x.set_age(Integer.parseInt(jTextFieldage.getText())); 
            email=jTextFieldemail.getText();
            if(email.contains("@") && email.contains(".")){
                x.set_email(email);
            }
            else{
               email=ex.checkEmail("email");
            }
             x.set_email(email);
           age=Integer.parseInt(jTextFieldage.getText());
            if(age>0&&age<150){
                x.set_age(age);
            }
            else{
               age=ex.checkPositive(" age ");
               x.set_age(age);
            }
            if (ad.add_c(x)) {
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
             JOptionPane.showMessageDialog(null,e+" in add");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 protected void resetPanelData() {
        jTextFieldid.setText("");
        jTextFieldfname.setText("");
        jTextFieldlname.setText("");
        jTextFieldemail.setText("");       
        jTextFieldage.setText("");

    }

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
