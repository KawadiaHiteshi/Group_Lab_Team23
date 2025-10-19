
package info5100.university.example.Department;

import info5100.university.example.CourseSchedule.CourseSchedule;
import java.lang.*;
import java.util.HashMap;
/**
 *
 * @author Jayashree
 */
public class Calendar {
    
    HashMap<String, CourseSchedule> mastercatalog; 
    
    public Calendar(){
    mastercatalog = new HashMap<String, CourseSchedule>();    
    }
    
    public void addCourseSchedule(String semester, CourseSchedule cs){
        
        mastercatalog.put(semester, cs);
        
    }
    
    
    
}

