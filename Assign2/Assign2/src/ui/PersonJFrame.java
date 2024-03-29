/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;


import model.HospitalDirDirectory;
import model.HospitalDirectory;

import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class PersonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonJFrame
     */
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
   HouseDirectory houseHistory;
   CommunityDirectory communityHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
    HospitalDirDirectory hospitalDirHistory;
    
    
    
    public PersonJFrame(PersonDirectory personHistory, PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,
    CityDirectory cityHistory,
    HospitalDirectory hospitalHistory,
    HospitalDirDirectory hospitalDirHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory = patientHistory;
        this.houseHistory=houseHistory;
       this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
       
        
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
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        agelbl = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        genderlbl = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        emailidlbl = new javax.swing.JLabel();
        emailidtxt = new javax.swing.JTextField();
        contactnolbl = new javax.swing.JLabel();
        contactnotxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        confirmpasswordlbl = new javax.swing.JLabel();
        confirmpasswordtxt = new javax.swing.JPasswordField();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namelbl.setText("Name");

        agelbl.setText("Age");

        genderlbl.setText("Gender");

        emailidlbl.setText("Email-ID");

        contactnolbl.setText("Contact No");

        passwordlbl.setText("Password");

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        confirmpasswordlbl.setText("Confirm Password");

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(agelbl)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderlbl)
                    .addComponent(gendertxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailidlbl)
                            .addComponent(contactnolbl)
                            .addComponent(passwordlbl)
                            .addComponent(contactnotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(confirmpasswordlbl)
                            .addComponent(confirmpasswordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(passwordtxt)
                            .addComponent(emailidtxt))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(submitbtn)
                        .addContainerGap(274, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(emailidlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelbl)
                    .addComponent(contactnolbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlbl)
                    .addComponent(passwordlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(confirmpasswordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(submitbtn)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        String name= nametxt.getText();
        int age= Integer.parseInt(agetxt.getText());
        String gender= gendertxt.getText();
        String emailid= emailidtxt.getText();
        long contactno= Long.parseLong(contactnotxt.getText());
        String password= passwordtxt.getText();
        String confirmpassword= confirmpasswordtxt.getText();
        
        Person p =personHistory.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setEmailid(emailid);
        p.setContactno(contactno);
        p.setPassword(password);
        p.setConfirmpassword(confirmpassword);
        
        JOptionPane.showMessageDialog(this, "Registered Successfully!!");
        dispose();
        
        
        
        PatientJFrame pat=new PatientJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory);
        pat.namelblpat.setText(nametxt.getText());
        pat.agelblpat.setText(agetxt.getText());
        pat.genderlblpat.setText(gendertxt.getText());
        pat.emailidlblpat.setText(emailidtxt.getText());
        pat.contactnolblpat.setText(contactnotxt.getText());
      
        pat.setVisible(true);
        
        nametxt.setText("");
        agetxt.setText("");
        gendertxt.setText("");
        emailidtxt.setText("");
        contactnotxt.setText("");
        passwordtxt.setText("");
        confirmpasswordtxt.setText("");
        
        
       
        
        
      
        
    }//GEN-LAST:event_submitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelbl;
    private javax.swing.JTextField agetxt;
    private javax.swing.JLabel confirmpasswordlbl;
    private javax.swing.JPasswordField confirmpasswordtxt;
    private javax.swing.JLabel contactnolbl;
    private javax.swing.JTextField contactnotxt;
    private javax.swing.JLabel emailidlbl;
    private javax.swing.JTextField emailidtxt;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
