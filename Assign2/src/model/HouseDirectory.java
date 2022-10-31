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
public class HouseDirectory {
    private ArrayList<House>houseHistory;

    public HouseDirectory() {
        this.houseHistory = new ArrayList<House>();
    }

    public ArrayList<House> getHouseHistory() {
        return houseHistory;
    }

    public void setHouseHistory(ArrayList<House> houseHistory) {
        this.houseHistory = houseHistory;
    }
    
    public House addNewHouse(){
        House newHouse= new House();
        houseHistory.add(newHouse);
        return newHouse;
    }
    public void deleteHouse(House h){
        houseHistory.remove(h);
    } 
    
    
}
