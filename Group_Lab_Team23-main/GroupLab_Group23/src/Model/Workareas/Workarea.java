/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Workareas;

import Model.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author prekshapraveen
 */
public class Workarea {
    Person person; //owner
    ArrayList<WorkRequest> inQueue;
    ArrayList<WorkRequest> outQueue;
    
    public Workarea(Person p){
        
        person = p;
        inQueue = new ArrayList();
        outQueue = new ArrayList();
        
        
    }
    
    public void addInQuestRequest(WorkRequest wr){
        inQueue.add(wr);
    }
}
