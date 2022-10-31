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
public class CityDirectory {
    private ArrayList<City>cityHistory;

    public CityDirectory() {
        this.cityHistory = new ArrayList<City>();
    }

    public ArrayList<City> getCityHistory() {
        return cityHistory;
    }

    public void setCityHistory(ArrayList<City> cityHistory) {
        this.cityHistory = cityHistory;
    }
    
    
    public City addNewCity(){
        City newCity= new City();
        cityHistory.add(newCity);
        return newCity;
    }
    public void deleteCity(City c){  
        cityHistory.remove(c);
    } 
    
    public City getCityAt(int index)
    {
       return cityHistory.get(index);
    }
    public int getCityLength(){
        return cityHistory.size();
    }
    
    public void updateCityDetailsAt(int index, City cityDetails )
    {
        cityHistory.set(index, cityDetails);
    }
    
    
}
