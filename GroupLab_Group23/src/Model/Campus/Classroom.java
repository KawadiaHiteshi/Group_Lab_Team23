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
public class Classroom {
    int number;
    Floor floor;
    Sprinkler sprinkler;
    ArrayList<Seat> seats;

    public Classroom(int n, Floor f) {
        number = n;
        seats = new ArrayList();
        floor = f;
        
    
    }
    public void setSprinkler(String m, String sn){
        
        sprinkler = new Sprinkler(m, sn);
        
    }
    public void generateSeats(int size){
        
    }
    public Boolean isRoomSafe(){
        if(sprinkler==null) return false;        
        if(sprinkler.isActive()==true) return true;
        else return false;
    }
}
