/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Persona;

import Model.CourseSchedule.CourseLoad;
import Model.CourseSchedule.SeatAssignment;
import Model.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;

/**
 *
 * @author prekshapraveen
 */
public class StudentProfile {
    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return (CourseLoad) transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return (CourseLoad) transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return (CourseLoad) transcript.newCourseLoad(s);
    }

    public ArrayList<Object> getCourseList() {

        return transcript.getCourseList();

    }
}
