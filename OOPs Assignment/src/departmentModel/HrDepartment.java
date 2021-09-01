package departmentModel;

import superModel.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public HrDepartment() {
		
	}
	
	public String departmentName(){
        	return "HR Department"; 
	}
	
	public String getTodaysWork(){
        	return "Fill today’s timesheet and mark your attendance"; 
	}
	
	public String getWorkDeadline(){
        	return "Complete by EOD"; 
	}
	
	public String doActivity(){
        	return "team Lunch"; 
	}

}
