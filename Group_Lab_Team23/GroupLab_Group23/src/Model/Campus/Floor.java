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
public class Floor {
    int number;
    ArrayList<Classroom> rooms;
    Building building;

    public Floor(int n, Building b) {
        number = n;
        building = b;
        rooms = new ArrayList();
    }
    public void newRoom(int n){
            Classroom r = new Classroom(n, this); //pass the floor object for reference
            rooms.add(r);
    }
    public Boolean isFloorSafe(){
        
        //check each classroom. If all classrooms are safe then floor is safe
        return true;
    }
}
