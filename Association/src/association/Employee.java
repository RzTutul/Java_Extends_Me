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
public class Employee {
    private int eId;
    private String eName;
    private EmployeeAddress eAddress;
    private EmployeeSalary eSalary;
    private ArrayList<EmployeeProject> eProject;

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    public Employee(EmployeeAddress eAddress, EmployeeSalary eSalary, ArrayList<EmployeeProject> eProject) {
        this.eAddress = eAddress;
        this.eSalary = eSalary;
        this.eProject = eProject;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public EmployeeAddress geteAddress() {
        return eAddress;
    }

    public void seteAddress(EmployeeAddress eAddress) {
        this.eAddress = eAddress;
    }

    public EmployeeSalary geteSalary() {
        return eSalary;
    }

    public void seteSalary(EmployeeSalary eSalary) {
        this.eSalary = eSalary;
    }

    public ArrayList<EmployeeProject> geteProject() {
        return eProject;
    }

    public void seteProject(ArrayList<EmployeeProject> eProject) {
        this.eProject = eProject;
    }

    @Override
    public String toString() {
        return "Employee{" + "eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eSalary=" + eSalary + ", eProject=" + eProject + '}';
    }
    
    
    
    
  
    
}
