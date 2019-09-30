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
public class EmployeeProject {
      
    private String proName;
    private String ProDuration;
    private String ProBudget;

    public EmployeeProject(String proName, String ProDuration, String ProBudget) {
        this.proName = proName;
        this.ProDuration = ProDuration;
        this.ProBudget = ProBudget;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDuration() {
        return ProDuration;
    }

    public void setProDuration(String ProDuration) {
        this.ProDuration = ProDuration;
    }

    public String getProBudget() {
        return ProBudget;
    }

    public void setProBudget(String ProBudget) {
        this.ProBudget = ProBudget;
    }

    @Override
    public String toString() {
        return "EmployeeProject{" + "proName=" + proName + ", ProDuration=" + ProDuration + ", ProBudget=" + ProBudget + '}';
    }
    
}
