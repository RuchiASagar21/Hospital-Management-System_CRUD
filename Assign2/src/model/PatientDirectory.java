/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import model.Patient;
/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class PatientDirectory {
    
private ArrayList<Patient>patientHistory;

    public PatientDirectory() {
        this.patientHistory=new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }

   
    public Patient addNewPatient(){
        Patient newPatient= new Patient();
        patientHistory.add(newPatient);
        return newPatient;
    }
    public void deletePatient(Patient pa){
        patientHistory.remove(pa);
    }  
    
    public Patient getPatientAt(int index)
    {
       return patientHistory.get(index);
    }
    public int getPatientLength(){
        return patientHistory.size();
    }
    
    public void updatePatientDetailsAt(int index, Patient patientDetails )
    {
        patientHistory.set(index, patientDetails);
    }
    
    
    
    
    
}
