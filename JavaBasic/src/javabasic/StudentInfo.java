/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author rztut
 */
public class StudentInfo {
    
    private String stdId;
    private String stdName;
    private String stdDept;
    private String stdPhone;

    public StudentInfo(String stdId, String stdName, String stdDept, String stdPhone) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdDept = stdDept;
        this.stdPhone = stdPhone;
    }

    public StudentInfo(String stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }
    
    
    

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        
       
          this.stdId = stdId;
       
  
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdDept() {
        return stdDept;
    }

    public void setStdDept(String stdDept) {
        this.stdDept = stdDept;
    }

    public String getStdPhone() {
        return stdPhone;
    }

    public void setStdPhone(String stdPhone) {
        
        if (stdPhone.length() >=11) {
           
            this.stdPhone = stdPhone;
        }
        else
        {
            System.out.println("Invalid phone number");
        }
        
    }
    
    
    public String allinfo()
    {
        return "ID = "+getStdId()+" name = "+getStdName()+" Department = "+getStdDept()+" Phone= "+getStdPhone();
    }
    
    
    
    
}
