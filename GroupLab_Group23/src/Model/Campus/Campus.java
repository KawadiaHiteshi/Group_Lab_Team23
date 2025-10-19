/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Campus;

import java.util.ArrayList;

/**
 *
 * @author prekshapraveen
 */
public class Campus {
    Address address;
    ArrayList<Building> buildings;
    public Campus(Address a){
    
        address = a;
        buildings = new ArrayList();
        
    }
}
