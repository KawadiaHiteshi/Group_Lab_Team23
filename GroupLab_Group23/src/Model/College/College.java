/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.College;

import Model.DepartmentCatalog.Department;
import java.util.ArrayList;

/**
 *
 * @author prekshapraveen
 */
public class College {
    ArrayList<Department> departments;
    
    public College(String name){
        departments = new ArrayList();
    }
}
