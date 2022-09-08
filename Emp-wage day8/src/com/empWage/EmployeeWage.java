package com.empWage;

public class EmployeeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to employee Wage");

		final int isFullTime = 1;
		final int isPartTime = 2;
		final int isAbsent = 3;

		int totalWorkingDays = 20;
		int empHrs = 0;
		int empWage = 0;
		int empRatePerHr = 20;
		int totalEmpHrs = 0;

		for (int days = 0; days < totalWorkingDays; days++) {
			int empCheck = (int) (Math.random() * 3) + 1;
			switch (empCheck) {
			case isFullTime:
				System.out.println("Employee is full time");
				empHrs = 8;
				break;
			case isPartTime:
				System.out.println("Employee is part time");
				empHrs = 4;
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
}
