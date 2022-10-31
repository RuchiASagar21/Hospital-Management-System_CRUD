/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class HospitalDirectory {

    private ArrayList<Hospital>hospitalHistory;
    
    public HospitalDirectory() {
        
        this.hospitalHistory=new ArrayList<Hospital>();
        
        
    }

    public ArrayList<Hospital> getHospitalHistory() {
        return hospitalHistory;
    }

    public void setHospitalHistory(ArrayList<Hospital> hospitalHistory) {
        this.hospitalHistory = hospitalHistory;
    }
    
    public Hospital addNewHospital(){
        Hospital newHospital= new Hospital();
        hospitalHistory.add(newHospital);
        return newHospital;
    }
    public void deleteHospital(Hospital hos){
        hospitalHistory.remove(hos);
        
    }
    
    public Hospital getHospitalAt(int index)
    {
       return hospitalHistory.get(index);
    }
    public int getHospitalLength(){
        return hospitalHistory.size();
    }
    
    public void updateHospitalDetailsAt(int index, Hospital hospitalDetails )
    {
        hospitalHistory.set(index, hospitalDetails);
    }
    
    
    
    
    
    
}
