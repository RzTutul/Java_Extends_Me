/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author rztut
 */
public class EmployeeSalary {
     
    private String eSalary;
    private String eBonus;

    public EmployeeSalary(String eSalary, String eBonus) {
        this.eSalary = eSalary;
        this.eBonus = eBonus;
    }

    public String geteSalary() {
        return eSalary;
    }

    public void seteSalary(String eSalary) {
        this.eSalary = eSalary;
    }

    public String geteBonus() {
        return eBonus;
    }

    public void seteBonus(String eBonus) {
        this.eBonus = eBonus;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" + "eSalary=" + eSalary + ", eBonus=" + eBonus + '}';
    }
    
}
