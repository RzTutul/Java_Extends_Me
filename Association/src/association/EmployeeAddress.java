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
public class EmployeeAddress {
    
    private String eEmail;
    private String ePhone;
    private String eLocation;

    public EmployeeAddress(String eEmail, String ePhone, String eLocation) {
        this.eEmail = eEmail;
        this.ePhone = ePhone;
        this.eLocation = eLocation;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone;
    }

    public String geteLocation() {
        return eLocation;
    }

    public void seteLocation(String eLocation) {
        this.eLocation = eLocation;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" + "eEmail=" + eEmail + ", ePhone=" + ePhone + ", eLocation=" + eLocation + '}';
    }
    
  
}
