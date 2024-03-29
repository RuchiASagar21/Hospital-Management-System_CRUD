/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.Hospital;
import model.HospitalDirDirectory;
import model.HospitalDirectory;



import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel
     */
    
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
    HouseDirectory houseHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
   CommunityDirectory communityHistory;
    HospitalDirDirectory hospitalDirHistory;
   
    public HospitalAdminJPanel(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory) {
        initComponents();
       
        this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        
        populateTableCommHos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelblhos = new javax.swing.JLabel();
        addresslblhos = new javax.swing.JLabel();
        zipcodelblhos = new javax.swing.JLabel();
        citylblhos = new javax.swing.JLabel();
        nametxthos = new javax.swing.JTextField();
        addresstxthos = new javax.swing.JTextField();
        zipcodetxthos = new javax.swing.JTextField();
        citytxthos = new javax.swing.JTextField();
        createbtnhos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitaldetailstbl = new javax.swing.JTable();
        updatebtnhos = new javax.swing.JButton();
        searchbtnhos = new javax.swing.JLabel();
        searchtxthos = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));

        namelblhos.setText("Name");

        addresslblhos.setText("Address");

        zipcodelblhos.setText("ZipCode");

        citylblhos.setText("City");

        createbtnhos.setText("Create");
        createbtnhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnhosActionPerformed(evt);
            }
        });

        hospitaldetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Address", "ZipCode", "City"
            }
        ));
        hospitaldetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitaldetailstblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitaldetailstbl);

        updatebtnhos.setText("Update");

        searchbtnhos.setText("Search");

        searchtxthos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxthosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelblhos)
                            .addComponent(addresslblhos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addresstxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchbtnhos)
                        .addGap(38, 38, 38)
                        .addComponent(searchtxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updatebtnhos)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(zipcodelblhos)
                                .addComponent(citylblhos))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(citytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(192, 192, 192))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(zipcodetxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createbtnhos)
                                    .addGap(49, 49, 49)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelblhos)
                            .addComponent(zipcodelblhos)
                            .addComponent(nametxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcodetxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(createbtnhos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addresslblhos)
                    .addComponent(addresstxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(citylblhos)
                        .addComponent(citytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(updatebtnhos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtnhos))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxthosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxthosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxthosActionPerformed

    private void createbtnhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnhosActionPerformed
        // TODO add your handling code here:
        String hospitalname= nametxthos.getText();
        String hospitaladdress= addresstxthos.getText();
        String hcity= citytxthos.getText();
        int hzipcode= Integer.parseInt(zipcodetxthos.getText());
       
        
        Hospital hos =hospitalHistory.addNewHospital();
        
        hos.setHospitalname(hospitalname);
        hos.setHospitaladdress(hospitaladdress);
        hos.setCity(hcity);
        hos.setZipcode(hzipcode);
        JOptionPane.showMessageDialog(this, "Registered Successfully!!");
        
        nametxthos.setText("");
        addresstxthos.setText("");
        citytxthos.setText("");
        zipcodetxthos.setText("");
    }//GEN-LAST:event_createbtnhosActionPerformed

    private void hospitaldetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitaldetailstblMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex=hospitaldetailstbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
          Hospital selectedHospital=(Hospital ) model.getValueAt(selectedRowIndex, 0);
          
          nametxthos.setText(selectedHospital.getHospitalname());
          addresstxthos.setText(selectedHospital.getHospitaladdress());
          zipcodetxthos.setText(String.valueOf(selectedHospital.getZipcode()));
          citytxthos.setText(selectedHospital.getCity());
    }//GEN-LAST:event_hospitaldetailstblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslblhos;
    private javax.swing.JTextField addresstxthos;
    private javax.swing.JLabel citylblhos;
    private javax.swing.JTextField citytxthos;
    private javax.swing.JButton createbtnhos;
    private javax.swing.JTable hospitaldetailstbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelblhos;
    private javax.swing.JTextField nametxthos;
    private javax.swing.JLabel searchbtnhos;
    private javax.swing.JTextField searchtxthos;
    private javax.swing.JButton updatebtnhos;
    private javax.swing.JLabel zipcodelblhos;
    private javax.swing.JTextField zipcodetxthos;
    // End of variables declaration//GEN-END:variables

private void populateTableCommHos() {
        DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
        model.setRowCount(0);
        
        for (Hospital hos: hospitalHistory.getHospitalHistory())
        {
            Object[] col=new Object[4];
            col[0]= hos;
            col[1]= hos.getHospitaladdress();
            col[2]=hos.getZipcode();
            col[3]=hos.getCity();
                   
            model.addRow(col);
            
        }
}

}




