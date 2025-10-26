/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Workareas;

import Model.Persona.Person;

/**
 *
 * @author prekshapraveen
 */
public class WorkRequest {
    String task;
    Person performer;
    Person originator;
    
    WorkRequest(Person org, Person per, String t){
        performer = per;
        originator = org;
        task = t;
    }
}
