/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class Patient extends Person {
    
    private String todaysdate;
    private String maritalstatus;
    private String insurance;
    private String allergies;
    private long emergencycontact;
    private String medicalhistory;
    private String symptoms;

   
   
    public String getTodaysdate() {
        return todaysdate;
    }

    public void setTodaysdate(String todaysdate) {
        this.todaysdate = todaysdate;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public long getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(long emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public void setMedicalhistory(String medicalhistory) {
        this.medicalhistory = medicalhistory;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    
    
@Override
    public String toString(){
        return todaysdate;
    }
    
    
    
    
}
