package com.empWage;

public class EmployeeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to employee Wage");

		final int isFullTime = 1;
		final int isPartTime = 2;
		final int isAbsent = 3;

		int empHrs = 0;
		int empWage = 0;
		int empRatePerHr = 20;
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
		empWage = empHrs * empRatePerHr;
		System.out.println("employee daily wage : " + empWage);
	}
}
