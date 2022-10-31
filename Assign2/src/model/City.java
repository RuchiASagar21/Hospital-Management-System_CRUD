/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class City extends Community{
    private String cityname;
    private String zipcodec;

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getZipcodec() {
        return zipcodec;
    }

    public void setZipcodec(String zipcodec) {
        this.zipcodec = zipcodec;
    }

     @Override
    public String toString(){
        return cityname;
    }
    
    
    
    
}
