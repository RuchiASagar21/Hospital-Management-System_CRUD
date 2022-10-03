/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directory;

import java.util.ArrayList;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class EmpDataHis {
   private ArrayList<EmpData> history;
   
   public EmpDataHis(){
       this.history = new ArrayList<EmpData>();
}

    public ArrayList<EmpData> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmpData> history) {
        this.history = history;
    }
   public EmpData addNewEmp(){
    EmpData newEmp = new EmpData();
      history.add(newEmp); 
      return newEmp;
   }
       public void deletedata(EmpData vs){
           history.remove(vs);
       }
}
