package driver;

import departmentModel.AdminDepartment;
import departmentModel.HrDepartment;
import departmentModel.TechDepartment;

public class DriverClass {
	
	public static void main(String []args){
        
        AdminDepartment A = new AdminDepartment();
        System.out.println(" Welcome to " + A.departmentName());
        System.out.println(A.getTodaysWork());
        System.out.println(A.getWorkDeadline());
        System.out.println(A.isTodayAHoliday());
        
        System.out.println("   ");
        
        HrDepartment H = new HrDepartment();
        System.out.println(" Welcome to " + H.departmentName());
        System.out.println(H.doActivity());
        System.out.println(H.getTodaysWork());
        System.out.println(H.getWorkDeadline());
        System.out.println(H.isTodayAHoliday());
        
        System.out.println("   ");
        
        TechDepartment T = new TechDepartment();
        System.out.println(" Welcome to " + T.departmentName());
        System.out.println(T.getTodaysWork());
        System.out.println(T.getWorkDeadline());
        System.out.println(T.getTechStackInformation());
        System.out.println(T.isTodayAHoliday());
     }

}
