/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author prekshapraveen
 */
public class CourseOffer {
    Course course;
    ArrayList<Seat> seatlist;
    
    public CourseOffer(Course c){
    course =c;
    seatlist = new ArrayList();
    }
    
    public String getCourseNumber(){
        return course.getCOurseNumber();
    }
    
    public void generatSeats(int n){
      for (int i=0; i<n; i++){
            seatlist.add(new Seat(this, i));
        }
    } 
    public Seat getEmptySeat(){
        for(Seat s: seatlist){
            if(!s.isOccupied()) return s;
    }
    return null;
    }   
    
    public int getTotalCourseRevenues(){
    int sum = 0;
    for(Seat s: seatlist){
    if(s.isOccupied()==true) sum = sum + course.getCoursePrice();
    }
    return sum;
    }
}
