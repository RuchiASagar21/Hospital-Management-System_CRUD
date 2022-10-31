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
public class HospitalDirDirectory {
    
     private ArrayList<HospitalDir>hospitalDirHistory;

    public HospitalDirDirectory() {
        
        this.hospitalDirHistory=new ArrayList<HospitalDir>();
        
        
    }

    public ArrayList<HospitalDir> getHospitalDirHistory() {
        return hospitalDirHistory;
    }

    public void setHospitalDirHistory(ArrayList<HospitalDir> hospitalDirHistory) {
        this.hospitalDirHistory = hospitalDirHistory;
    }
    
    public HospitalDir addNewHospitalDir(){
        HospitalDir newHospitalDir= new HospitalDir();
        hospitalDirHistory.add(newHospitalDir);
        return newHospitalDir;
    }
    public void deleteHospitalDir(HospitalDir hd){
        hospitalDirHistory.remove(hd);
    }  
    
    public HospitalDir getHospitalDirAt(int index)
    {
       return hospitalDirHistory.get(index);
    }
    public int getHospitalDirLength(){
        return hospitalDirHistory.size();
    }
    
    public void updateHospitalDirDetailsAt(int index, HospitalDir HospitalDirDetails )
    {
        hospitalDirHistory.set(index, HospitalDirDetails);
    }
    
    
    
    
}
