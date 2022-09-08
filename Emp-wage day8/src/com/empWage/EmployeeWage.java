package com.empWage;

public class EmployeeWage {
	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int isAbsent = 3;
	static final int maxWorkingHrs = 100;
	static final int maxWorkingDays = 20;
	static final int empRatePerHr = 20;

	public static void computeWage() {
		int empHrs = 0;
		int empWage = 0;
		int days = 0;
		int totalEmpHrs = 0;

		while (days < maxWorkingDays && totalEmpHrs <= maxWorkingHrs) {
			int empCheck = (int) (Math.random() * 3) + 1;
			days++;
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				System.out.println("Employee is full time");
				break;
			case isPartTime:
				empHrs = 4;
				System.out.println("Employee is part time");
				break;
			case isAbsent:
				System.out.println("Employee is absent");
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
		}
		System.out.println("Total employee hours : " + totalEmpHrs);
		empWage = totalEmpHrs * empRatePerHr;
		System.out.println("employee Monthly wage : " + empWage);
	}

	public static void main(String[] args) {
		computeWage();
	}
}
