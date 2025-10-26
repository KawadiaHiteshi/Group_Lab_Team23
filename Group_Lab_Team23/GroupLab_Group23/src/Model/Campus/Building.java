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
public class Building {
    int number;
    ArrayList<Floor> floors;
    Address address;
    public Building(int n, Address ad){
        number = n;
        address = ad;
        floors = new ArrayList();
    }
    public Floor addNewFloor(int n){
        Floor f = new Floor(n, this); //reference back to building;
        floors.add(f);
        return f;
    }
    public Boolean isBuildingSafe(){
        
        //Building is safe if all floors are safe
        return true; //to be completed
    }
}
