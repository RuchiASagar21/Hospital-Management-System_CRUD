/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Deepak Sawalka
 */
public class Encounter extends VitalSigns {
    
    private String encountertime;
    private String diagnosis;
    private String medtest;
    private String prescription;

    public String getEncountertime() {
        return encountertime;
    }

    public void setEncountertime(String encountertime) {
        this.encountertime = encountertime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedtest() {
        return medtest;
    }

    public void setMedtest(String medtest) {
        this.medtest = medtest;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
