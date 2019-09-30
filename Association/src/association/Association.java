/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

import java.util.ArrayList;

/**
 *
 * @author rztut
 */
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        Employee e1 = new Employee(123, "Rz Tutul");
        e1.seteAddress(new EmployeeAddress("rz.tutul@gmail.com", "01924250146", "Dhaka"));
        e1.seteSalary(new EmployeeSalary("10000000", "10000"));
        e1.seteProject(new ArrayList<EmployeeProject>());
        e1.geteProject().add(new EmployeeProject("Tourmate", "6", "1000000"));
        e1.geteProject().add(new EmployeeProject("E-Comerce", "5", "500000"));
        e1.geteProject().add(new EmployeeProject("Map", "1", "1000000"));
   
        Employee e2 = new Employee(213, "Jack Sprarrow");
        e2.seteAddress(new EmployeeAddress("rz.jack@gmail.com", "019242505", "Dhaka"));
        e2.seteSalary(new EmployeeSalary("10000000", "10000"));
        e2.seteProject(new ArrayList<EmployeeProject>());
        e2.geteProject().add(new EmployeeProject("Tourmate_v3", "6", "1000000"));
        e2.geteProject().add(new EmployeeProject("E-Comerce_V3", "5", "500000"));
        e2.geteProject().add(new EmployeeProject("Map_V2", "1", "1000000"));
   
 
        employees.add(e1);
        employees.add(e2);
        
        for(Employee e : employees)
        {
            System.out.println(""+e);
        }
        
       ///Find email address  of e2
       
        System.out.println(""+e2.geteAddress().geteEmail());
        
        
        ///Find Project name of e2;
        
        for (EmployeeProject project : e2.geteProject() ) {
            
            System.out.println(""+project.getProName());
            
        }
  
  
        
    }
    
}
