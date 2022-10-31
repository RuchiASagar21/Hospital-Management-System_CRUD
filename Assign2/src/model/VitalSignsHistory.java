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
public class VitalSignsHistory {
    
private ArrayList<VitalSigns>vitalSignsHistory;
    public VitalSignsHistory() {
        
        this.vitalSignsHistory=new ArrayList<VitalSigns>();
    
        
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addNewVitalSigns(){
        VitalSigns newVitalSigns= new VitalSigns();
        vitalSignsHistory.add(newVitalSigns);
        return newVitalSigns;
    }
    
}
