/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author prekshapraveen
 */
public class Course {
    String number;
    String name;
    int credits;
    int price = 1250; //per credit hour
    public Course(String n, String numb, int ch, int p){
        name = n;
        number = numb;
        credits = ch;
        price = p;      
    }
    
    public String getCOurseNumber(){
        return number;
    }

    public int getCoursePrice(){
        return price*credits;
    }    
}
