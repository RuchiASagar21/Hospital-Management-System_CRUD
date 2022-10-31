/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class HospitalDir extends Hospital {
    
    private String docname;
    private String docgender;
    private String docemailid;
    private long doccontactno;
    private String degree;
    private String speciality;
    private String experience;
    private String availability;

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getDocgender() {
        return docgender;
    }

    public void setDocgender(String docgender) {
        this.docgender = docgender;
    }

    public String getDocemailid() {
        return docemailid;
    }

    public void setDocemailid(String docemailid) {
        this.docemailid = docemailid;
    }

    public long getDoccontactno() {
        return doccontactno;
    }

    public void setDoccontactno(long doccontactno) {
        this.doccontactno = doccontactno;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
   @Override
    public String toString(){
        return hospitalname;
    } 
    
    
}
