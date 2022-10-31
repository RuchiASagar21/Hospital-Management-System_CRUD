/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class Person {
    String name;
    private int age;
    private String gender;
    private long contactno;
    private String emailid;
    private String password;
    

   
    


    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getContactno() {
        return contactno;
    }

    public void setContactno(Long contactno) {
        this.contactno = contactno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
