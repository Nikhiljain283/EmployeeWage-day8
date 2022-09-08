package com.empWage;

public class EmployeeWage {
	public static void main(String[] args) {

		System.out.println("Welcome to employee Wage");

		final int present = 1;
		final int absent = 2;
		int empCheck = (int) (Math.random() * 2) + 1;

		if (empCheck == present) {
			System.out.println("Employee is present");
		} else
			System.out.println("Employee is absent");
	}
}
