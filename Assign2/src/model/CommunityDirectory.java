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
public class CommunityDirectory {
    private ArrayList<Community>communityHistoryH;

    public CommunityDirectory() {
        this.communityHistoryH = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityHistoryH() {
        return communityHistoryH;
    }

    public void setCommunityHistoryH(ArrayList<Community> communityHistoryH) {
        this.communityHistoryH = communityHistoryH;
    }

    
    
    public Community addNewCommunityH(){
        Community newCommunity= new Community();
        communityHistoryH.add(newCommunity);
        return newCommunity;
    }
    public void deleteCommunityH(Community ch){
        communityHistoryH.remove(ch);
    }  
    
    
}
