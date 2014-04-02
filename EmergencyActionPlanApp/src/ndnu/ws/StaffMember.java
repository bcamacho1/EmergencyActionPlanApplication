/* The StaffMemeber class is used to set and get all the   
 * information regarding employee that is allowed to use
 * the application.
 *  
 * Author:  Camacho Bozena
 * Version: 1.0.
 * Date:    03-31-2014
 */

package ndnu.ws;

public class StaffMember implements java.io.Serializable {

    private String employeeID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String phone;
    private String position;
    private boolean active;
    
    public StaffMember() {
    	employeeID = null;
    	firstName = null;
    	lastName = null;
        emailAddress = null;
        password = null;
        phone = null; 
        position = null;
        active = false;
    }
    
    public StaffMember(String id, String first, 
    String last, String passwd, String phoneNumb, String email, String pos) {
        employeeID = id;
    	firstName = first;
    	lastName = last;
        emailAddress = email;
        password = passwd;
        phone = phoneNumb; 
        position = pos;
    }
	 
    public void setEmployeeID(String id){
        employeeID = id;
    }
	
    public void setFirstName(String fName) {
    	firstName = fName;
    }
	
    public void setLastName(String lName) {
    	lastName = lName;
    }
	
    public void setEmailAddress(String email) {
	emailAddress = email;
    }
	
    public void setPassword(String pword){
        password = pword;
    }
    
    public void setPhone(String phoneNum) {
	phone = phoneNum;
    }
	
    public void setPosition(String pos){
        position = pos;
    }
	
    public String getEmployeeID(){
        return employeeID;
    }
 
    public String getFirstName() {
	return firstName;
    }
	
    public String getLastName() {
	return lastName;
    }
	
    public String getPassword(){
        return password;
    }
    
    public String getPhone() {
    	return phone;
    }
        
    public String getPosition(){
        return position;
    }
    
    public String getEmailAddress() {
		return emailAddress;
	}

    //check if user is logged in or not
	public boolean isActive() {
		return active;
	}
    
	//set user activity in the application
	public void setIsActive(boolean active) {
		this.active = active;
	}
	
	 @Override
	 public String toString(){
	    return getLastName() + " " + getFirstName() + ", " + getPosition() + ", " + getPhone() + ", " + getEmailAddress();
	}
}
