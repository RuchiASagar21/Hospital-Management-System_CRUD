/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class PersonDirectory {
    private ArrayList<Person> personHistory;

    public PersonDirectory() {
        this.personHistory = new ArrayList<Person>(); 
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    public Person addPerson(){
    Person person = new Person();
      personHistory.add(person);
      return person;
   }
       public void deletedata(Person vs){
           personHistory.remove(vs);
       }
}
