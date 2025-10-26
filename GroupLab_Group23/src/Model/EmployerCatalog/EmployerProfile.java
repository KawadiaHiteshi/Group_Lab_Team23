/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EmployerCatalog;

import java.util.ArrayList;

/**
 *
 * @author hiteshikawadia
 */
public class EmployerProfile {
    String name;
    ArrayList<Employment> employments;
    public EmployerProfile(String n){  //could be company instead of just a name as a string
        name = n;
        
    }
         public boolean isMatch(String id){
        if(name.equals(id)) return true;             //String is an object and can do equal matach
        return false;
    }
}
