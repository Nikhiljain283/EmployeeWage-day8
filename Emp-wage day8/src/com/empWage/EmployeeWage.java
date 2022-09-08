package com.empWage;

public class EmployeeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to employee Wage");

		final int isFullTime = 1;
		final int isPartTime = 2;
		final int isAbsent = 3;
		final int maxWorkingHrs = 100;
		final int maxWorkingDays = 20;

		int empHrs = 0;
		int empWage = 0;
		int empRatePerHr = 20;
		int totalEmpHrs = 0;
		int days = 0;

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
}
