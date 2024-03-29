/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class HospitalPatientDetailsSystem extends javax.swing.JFrame {

    /**
     * Creates new form HospitalPatientDetailsSystem
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
    public HospitalPatientDetailsSystem(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
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
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
         populateTableHosPatD();
        
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docdirtbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patnamev = new javax.swing.JTextField();
        agev = new javax.swing.JTextField();
        genderv = new javax.swing.JTextField();
        emailidv = new javax.swing.JTextField();
        contactnov = new javax.swing.JTextField();
        maritalv = new javax.swing.JTextField();
        allergiesv = new javax.swing.JTextField();
        medv = new javax.swing.JTextField();
        symv = new javax.swing.JTextField();
        emergencyv = new javax.swing.JTextField();
        docnamev = new javax.swing.JTextField();
        hospnamev = new javax.swing.JTextField();
        aptdatev = new javax.swing.JTextField();
        timeslotv = new javax.swing.JTextField();
        createbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        docdirtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Email ID", "Contact No", "Marital Status", "Allergies", "Medical History", "Symptoms", "Emergency Contactno", "Doctor Name", "Hospital Name", "Appointment Date", "Time Slot"
            }
        ));
        docdirtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docdirtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docdirtbl);

        jLabel1.setText("Patient Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        jLabel4.setText("Email ID");

        jLabel5.setText("Contact No");

        jLabel6.setText("Marital Status");

        jLabel7.setText("Allergies");

        jLabel8.setText("Medical History");

        jLabel9.setText("Symptoms");

        jLabel10.setText("Emergency Contact");

        jLabel11.setText("Doctorn Name");

        jLabel12.setText("Hospital Name");

        jLabel13.setText("Appoinment Date");

        jLabel14.setText("Time Slot");

        genderv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendervActionPerformed(evt);
            }
        });

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agev, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailidv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactnov, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(allergiesv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(maritalv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(medv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(symv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(127, 127, 127)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(docnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hospnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(timeslotv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(aptdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emergencyv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createbtn)
                .addGap(18, 18, 18)
                .addComponent(updatebtn)
                .addGap(18, 18, 18)
                .addComponent(deletebtn)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createbtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(maritalv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(docnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(allergiesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(hospnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(medv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailidv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addComponent(contactnov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(symv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(aptdatev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emergencyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(timeslotv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void docdirtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docdirtblMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex=docdirtbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
            return;}

        DefaultTableModel model=(DefaultTableModel) docdirtbl.getModel();
        Doctor selectedDoctor=(Doctor) model.getValueAt(selectedRowIndex, 0);

        patnamev.setText(selectedDoctor.getName());
        agev.setText(String.valueOf(selectedDoctor.getAge()));
        genderv.setText(selectedDoctor.getGender());
        emailidv.setText(selectedDoctor.getEmailid());
        contactnov.setText(String.valueOf(selectedDoctor.getContactno()));

        maritalv.setText(selectedDoctor.getMaritalstatus());
        allergiesv.setText(selectedDoctor.getAllergies());
        medv.setText(selectedDoctor.getMedicalhistory());
        symv.setText(selectedDoctor.getSymptoms());
        emergencyv.setText(String.valueOf(selectedDoctor.getEmergencycontact()));
        docnamev.setText(selectedDoctor.getDocname());
        hospnamev.setText(selectedDoctor.getHospitalname());
        aptdatev.setText(selectedDoctor.getAptdate());
        timeslotv.setText(selectedDoctor.getTimeslot());

    }//GEN-LAST:event_docdirtblMouseClicked

    private void gendervActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendervActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendervActionPerformed
 private boolean validateData9() {
                if (patnamev.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Name is required!!");
            return false;
        }
                        if (agev.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Age is required!!");
            return false;
        }
                        if (genderv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please enter your gender");
            return false;
        }
                        if (emailidv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "EmailId is required");
            return false;
        }
                                  if (contactnov.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Contact Number");
            return false;
        }
                  
         if (maritalv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter marital status");
            return false;
        }
                        if (hospnamev.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Hospital Name is required");
            return false;
        }
                        if (allergiesv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please Enter any allergies or Type NA");
            return false;
        }
                        if (emergencyv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Emergency contact number required");
            return false;
        }
                                  if (medv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter medical history or type NA");
            return false;
        }      
                                  if (symv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter symptoms or type NA");
            return false;
        }   
                                         if (docnamev.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Doctor name is required");
            return false;
        }
                                  if (aptdatev.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please Enter Appoinment date");
            return false;
        }      
                                  if (timeslotv.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Time slot");
            return false;
        }  
                        
return true;    }
    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        boolean valid=validateData9();
        if(valid){
        String namep=patnamev.getText();
        int agep=Integer.parseInt(agev.getText());
        String genderp=genderv.getText();
        String emailp=emailidv.getText();
        long contactp=Long.parseLong(contactnov.getText());
        String maritalp=maritalv.getText();
        String allergiesp=allergiesv.getText();
        long emergencyp=Long.parseLong(emergencyv.getText());
        String medhistp=medv.getText();
        String symp=symv.getText();

        String hospitalname= hospnamev.getText();

        String doctorname= docnamev.getText();

        String aptdate= aptdatev.getText();

        String timeslot= timeslotv.getText();

        Doctor d =doctorHistory.addNewDoctor();
        d.setName(namep);
        d.setAge(agep);
        d.setGender(genderp);
        d.setEmailid(emailp);
        d.setContactno(contactp);
        d.setMaritalstatus(maritalp);
        d.setAllergies(allergiesp);
        d.setEmergencycontact(emergencyp);
        d.setMedicalhistory(medhistp);
        d.setSymptoms(symp);
        d.setHospitalname(hospitalname);

        d.setDocname(doctorname);

        d.setAptdate(aptdate);
        d.setTimeslot(timeslot);

        JOptionPane.showMessageDialog(this, "Appointment Created  Successfullyy!!");

        patnamev.setText("");
        agev.setText("");
        genderv.setText("");
        emailidv.setText("");
        contactnov.setText("");
        maritalv.setText("");
        allergiesv.setText("");
        emergencyv.setText("");
        medv.setText("");
        symv.setText("");
        hospnamev.setText("");
        docnamev.setText("");
        aptdatev.setText("");
        timeslotv.setText("");}

    }//GEN-LAST:event_createbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        int i=docdirtbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) docdirtbl.getModel();

        Doctor selectedDoctor=(Doctor) doctorHistory.getDoctorAt(i);

        selectedDoctor.setName(patnamev.getText());
        selectedDoctor.setAge(Integer.parseInt(agev.getText()));
        selectedDoctor.setGender(genderv.getText());
        selectedDoctor.setEmailid(emailidv.getText());
        selectedDoctor.setContactno(Long.parseLong(contactnov.getText()));
        selectedDoctor.setMaritalstatus(maritalv.getText());
        selectedDoctor.setAllergies(allergiesv.getText());
        selectedDoctor.setMedicalhistory(medv.getText());
        selectedDoctor.setSymptoms(symv.getText());
        selectedDoctor.setEmergencycontact(Long.parseLong(emergencyv.getText()));
        selectedDoctor.setDocname(docnamev.getText());
        selectedDoctor.setHospitalname(hospnamev.getText());
        selectedDoctor.setAptdate(aptdatev.getText());
        selectedDoctor.setTimeslot(timeslotv.getText());

        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }

        model.setValueAt(patnamev.getText(), i, 0);
        model.setValueAt(agev.getText(), i, 1);
        model.setValueAt(genderv.getText(), i, 2);
        model.setValueAt(emailidv.getText(), i, 3);
        model.setValueAt(contactnov.getText(), i, 4);

        model.setValueAt(maritalv.getText(), i, 5);
        model.setValueAt(allergiesv.getText(), i, 6);
        model.setValueAt(medv.getText(), i, 7);
        model.setValueAt(symv.getText(), i, 8);
        model.setValueAt(emergencyv.getText(), i, 9);
        model.setValueAt(docnamev.getText(), i, 10);
        model.setValueAt(hospnamev.getText(), i, 11);
        model.setValueAt(aptdatev.getText(), i, 12);
        model.setValueAt(timeslotv.getText(), i, 12);
        JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
         int i=docdirtbl.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) docdirtbl.getModel();
          Doctor selectedDoctor=(Doctor) model.getValueAt(i, 0);
          int response=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response==JOptionPane.YES_OPTION){
             
          doctorHistory.deleteDoctor(selectedDoctor);
          JOptionPane.showMessageDialog(this, "Patient appointment Record Deleted Successfully!!");
          }
          else {
              JOptionPane.showMessageDialog(this, "OK!!");
          }
        
          
           populateTableHosPatD();
           patnamev.setText("");
        agev.setText("");
        genderv.setText("");
        emailidv.setText("");
        contactnov.setText("");
        maritalv.setText("");
        allergiesv.setText("");
        emergencyv.setText("");
        medv.setText("");
        symv.setText("");
        hospnamev.setText("");
        docnamev.setText("");
        aptdatev.setText("");
        timeslotv.setText("");
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        SystemJFrame systemjframe=new SystemJFrame( personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        systemjframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agev;
    private javax.swing.JTextField allergiesv;
    private javax.swing.JTextField aptdatev;
    private javax.swing.JTextField contactnov;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable docdirtbl;
    private javax.swing.JTextField docnamev;
    private javax.swing.JTextField emailidv;
    private javax.swing.JTextField emergencyv;
    private javax.swing.JTextField genderv;
    private javax.swing.JTextField hospnamev;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maritalv;
    private javax.swing.JTextField medv;
    private javax.swing.JTextField patnamev;
    private javax.swing.JTextField symv;
    private javax.swing.JTextField timeslotv;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables



private void populateTableHosPatD() {
        DefaultTableModel model=(DefaultTableModel) docdirtbl.getModel();
        model.setRowCount(0);
        
        for (Doctor d : doctorHistory.getDoctorHistory())
        {
            Object[] col=new Object[14];
            col[0]= d;
            col[1]= d.getAge();
            col[2]= d.getGender();
            col[3]= d.getEmailid();
            col[4]= d.getContactno();
            col[5]=d.getMaritalstatus();
            col[6]=d.getAllergies();
            col[7]= d.getMedicalhistory();
            col[8]= d.getSymptoms();
            col[9]=d.getEmergencycontact();
            col[10]= d.getDocname();
            col[11]= d.getHospitalname();
            col[12]= d.getAptdate();
            col[13]= d.getTimeslot();
            
            
            model.addRow(col);
            
        }
}











}
