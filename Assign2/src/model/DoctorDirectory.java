/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Deepak Sawalka
 */
public class DoctorDirectory {

    
    private ArrayList<Doctor>doctorHistory;
    
    public DoctorDirectory() {
        this.doctorHistory = new ArrayList<Doctor>();      
        
    }

    public ArrayList<Doctor> getDoctorHistory() {
        return doctorHistory;
    }

    public void setDoctorHistory(ArrayList<Doctor> doctorHistory) {
        this.doctorHistory = doctorHistory;
    }
    
    
    public Doctor addNewDoctor(){
        Doctor newDoctor= new Doctor();
        doctorHistory.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor d){
        doctorHistory.remove(d);
    } 
    
    
    public Doctor getDoctorAt(int index)
    {
       return doctorHistory.get(index);
    }
    public int getDoctorLength(){
        return doctorHistory.size();
    }
    
    public void updateDoctorDetailsAt(int index, Doctor doctorDetails )
    {
        doctorHistory.set(index, doctorDetails);
    }
    
    
    
}
