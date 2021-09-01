package departmentModel;

import superModel.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public AdminDepartment() {
		
	}
	
	public String departmentName(){
			return "Admin Department"; 
	}
	
	public String getTodaysWork(){
			return "Complete your documents submission"; 
	}
	
	public String getWorkDeadline(){
        	return "Complete by EOD"; 
	}
	     	
}
