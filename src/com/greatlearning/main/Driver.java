package com.greatlearning.main;

import com.greatlearning.service.AdminDepartment;
import com.greatlearning.service.HrDepartment;
import com.greatlearning.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment employee1 = new AdminDepartment();
		 String AdminEmployee = "Welcome to "+ employee1.departmentName() + employee1.getTodaysWork() + employee1.getWorkDeadline() + employee1.isTodayAHoliday();
		 System.out.println(AdminEmployee);
		 
		 HrDepartment employee2 = new HrDepartment();
		 String HrEmployee =    "Welcome to "+ employee2.departmentName() + employee2.doActivity() + employee2.getTodaysWork() + employee2.getWorkDeadline() + employee1.isTodayAHoliday();
		 System.out.println(HrEmployee);
		 
		 TechDepartment employee3 = new TechDepartment();
		 String TechEmployee =  "Welcome to "+ employee3.departmentName() + employee3.getTodaysWork() + employee3.getWorkDeadline() + employee3.getTechStackInformation() + employee1.isTodayAHoliday();
		 System.out.println(TechEmployee);

	}
	}


