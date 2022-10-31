/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Deepak Sawalka
 */
public class Doctor extends HospitalDir{
    
    private String aptdate;
    private String timeslot;

    public String getAptdate() {
        return aptdate;
    }

    public void setAptdate(String aptdate) {
        this.aptdate = aptdate;
    }

    

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
    
    @Override
    public String toString(){
        return name;
    }
     
    
    
}
