/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;


import model.HospitalDir;
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
public class PatientSearch extends javax.swing.JFrame {

    /**
     * Creates new form PatientSearch
     */
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
    HouseDirectory houseHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
   CommunityDirectory communityHistory;
    HospitalDirDirectory hospitalDirHistory;
    
    
    public PatientSearch(PersonDirectory personHistory,PatientDirectory patientHistory,
    HouseDirectory houseHistory,CommunityDirectory communityHistory,CityDirectory cityHistory,HospitalDirectory hospitalHistory,
    HospitalDirDirectory hospitalDirHistory) {
        initComponents();
         this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        
       
        populateTableHd();
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
        searchlbl = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitaldoctordetailstbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        selectbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchlbl.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        searchlbl.setText("Search");

        hospitaldoctordetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Address", "ZipCode", "City", "Doctor Name", "gender", "Email ID", "Contact No", "Degree", "Speciality", "Experience", "Availibility"
            }
        ));
        jScrollPane1.setViewportView(hospitaldoctordetailstbl);

        backbtn.setText("<<");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        selectbtn.setText("Select");
        selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(searchlbl)
                                .addGap(41, 41, 41)
                                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(backbtn)))
                        .addGap(0, 505, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(selectbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backbtn)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchlbl)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(selectbtn)
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginJFrame loginjframe=new LoginJFrame( personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory);
        loginjframe.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void selectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex=hospitaldoctordetailstbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) hospitaldoctordetailstbl.getModel();
          HospitalDir selectedHospitalDir=(HospitalDir ) model.getValueAt(selectedRowIndex, 0);
          
         
          AppointmentJFrame a=new AppointmentJFrame();
          a.hospitalnamelbl.setText(selectedHospitalDir.getHospitalname());
          a.hospitaladdresslbl.setText(selectedHospitalDir.getHospitaladdress());
          a.zipcodelbl.setText(String.valueOf(selectedHospitalDir.getZipcode()));
          a.citylbl.setText(selectedHospitalDir.getCity());
          a.doctornamelbl.setText(selectedHospitalDir.getDocname());
          a.genderlbl.setText(selectedHospitalDir.getDocgender());
          a.emailidlbl.setText(selectedHospitalDir.getDocemailid());
          a.contactnolbl.setText(String.valueOf(selectedHospitalDir.getDoccontactno()));
          a.degreelbl.setText(selectedHospitalDir.getDegree());
          a.specialitylbl.setText(selectedHospitalDir.getSpeciality());
          a.experiencelbl.setText(selectedHospitalDir.getExperience());
          a.availabilitylbl.setText(selectedHospitalDir.getAvailability());
          
          a.setVisible(true);
          
          
          
          
          
      
    }//GEN-LAST:event_selectbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTable hospitaldoctordetailstbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchlbl;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton selectbtn;
    // End of variables declaration//GEN-END:variables

private void populateTableHd() {
        DefaultTableModel model=(DefaultTableModel) hospitaldoctordetailstbl.getModel();
        model.setRowCount(0);
        
        for (HospitalDir hd : hospitalDirHistory.getHospitalDirHistory())
        {
            Object[] col=new Object[12];
            col[0]= hd;
            col[1]= hd.getHospitaladdress();
            col[2]= hd.getZipcode();
            col[3]= hd.getCity();
            col[4]= hd.getDocname();
            col[5]= hd.getDocgender();
            col[6]= hd.getDocemailid();
            col[7]= hd.getDoccontactno();
            col[8]= hd.getDegree();
            col[9]= hd.getSpeciality();
            col[10]= hd.getExperience();
            col[11]= hd.getAvailability();
             
            
            model.addRow(col);
            
        }
}



}




