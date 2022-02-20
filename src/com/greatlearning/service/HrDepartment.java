package com.greatlearning.service;

import com.greatlearning.model. SuperDepartment;
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
        return "HR Department" + "\n";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance" + "\n";
    }

    public String doActivity() {
        return "team Lunch" + "\n";
    }

    public String getWorkDeadline() {
        return "Complete by EOD" + "\n";
    }
}
