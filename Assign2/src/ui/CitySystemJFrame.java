/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.City;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class CitySystemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CitySystemJFrame
     */
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
    HouseDirectory houseHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
   CommunityDirectory communityHistory;
    HospitalDirDirectory hospitalDirHistory;
    DoctorDirectory doctorHistory;
    EncounterHistory encounterHistory;
     VitalSignsHistory vitalSignsHistory;
    
    public CitySystemJFrame(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory, VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
        
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
        citycbox = new javax.swing.JComboBox<>();
        citylbl = new javax.swing.JLabel();
        zipcodelbl = new javax.swing.JLabel();
        zipcodecbox = new javax.swing.JComboBox<>();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("City");

        citycbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Worchester", "Beverly" }));
        citycbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citycboxActionPerformed(evt);
            }
        });

        citylbl.setText("City");

        zipcodelbl.setText("ZipCode/Community");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitbtn)
                .addGap(170, 170, 170))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcodelbl))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(citycbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zipcodecbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citylbl)
                    .addComponent(citycbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(submitbtn)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodelbl)
                    .addComponent(zipcodecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
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

    private void citycboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citycboxActionPerformed
        // TODO add your handling code here:
        try{
        if(citycbox.getSelectedItem().equals("Boston")){
            zipcodecbox.removeAllItems();
            
            zipcodecbox.addItem("02120");
            zipcodecbox.addItem("02119");
            zipcodecbox.setSelectedItem(null);
        }
        else if (citycbox.getSelectedItem().equals("Worchester")){
            zipcodecbox.removeAllItems();
            
            zipcodecbox.addItem("01601");
            zipcodecbox.addItem("01653");
            zipcodecbox.setSelectedItem(null);
        }
        else if (citycbox.getSelectedItem().equals("Beverly")){
            zipcodecbox.removeAllItems();
           
            zipcodecbox.addItem("97211");
            zipcodecbox.addItem("97314");
            zipcodecbox.setSelectedItem(null);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
            
    }//GEN-LAST:event_citycboxActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        String city=(String) citycbox.getSelectedItem();
        String zipcode=(String) zipcodecbox.getSelectedItem();
        City c =cityHistory.addNewCity();
        c.setCityname(city);
        c.setZipcodec(zipcode);
        
        JOptionPane.showMessageDialog(this, "\n Selected City: "+city+"\n Selected Community/ZipCode: "+zipcode+"\n");
        dispose();
        CityJFrame cityJFrame=new CityJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        cityJFrame.setVisible(true);
            
        
    }//GEN-LAST:event_submitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> citycbox;
    private javax.swing.JLabel citylbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitbtn;
    private javax.swing.JComboBox<String> zipcodecbox;
    private javax.swing.JLabel zipcodelbl;
    // End of variables declaration//GEN-END:variables
}
