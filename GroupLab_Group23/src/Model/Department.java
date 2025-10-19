/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author prekshapraveen
 */
public class Department {
    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    Department studentdirectory;
    FacultyDirectory facultydirectory;
    
    HashMap<String, CourseSchedule> mastercoursecatalog;
    
    public Departmentg n){
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new Department(this);
        persondirectory = new PersonDirectory();
    }    
}
