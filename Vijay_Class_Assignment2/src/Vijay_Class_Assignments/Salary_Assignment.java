package Vijay_Class_Assignments;

import java.util.Scanner;

public class Salary_Assignment {


	int emplevel,basic,bonas,boa;
	
	public Salary_Assignment(int basic2, int boa2, int level) {
		// TODO Auto-generated constructor stub
	}


	public void SalaryAssignment(int basic1, int boa1, int emplevel1) {
		
	
		emplevel = emplevel1;
		basic = basic1; 
		boa = boa1;	
		
		
	}

	
	public float calculateTax(int grossSalary) {
		float tax = 0;
		
		if(grossSalary<250000) tax=0;
		else if(grossSalary>=250000 && grossSalary<500000) tax=(0.05f*grossSalary);
		else if(grossSalary>=500000 && grossSalary<1000000) tax=(0.2f*grossSalary);
		else tax=(0.3f*grossSalary);
		
		return tax;
		
	}
	public float calculatePF() {
		float pf = 0;
		pf= (0.12f)*basic;
		return pf;
	}
	
	public int calculatePerformacebonus() {
		int bonus=0;
		
		switch (emplevel) {
		case 1: bonus=2000; break;
		case 2:bonus=2500; break;
		case 3:bonus=3000; break;
		case 4:bonus=3500; break;
		default:bonus=0; break;
			
		}
		
		return bonus;
	}
	
	public void printTakeHomeSalary() {
		
		int bonus = calculatePerformacebonus();
		int monthlyGrossSal = basic +boa+bonus;
		int yearlyGrossSal = monthlyGrossSal*12;
		float tax = calculateTax(yearlyGrossSal);
		
		float pf = calculatePF();
		
		float inHandSalary = monthlyGrossSal-(tax/12)-pf;
		System.out.println("Total Salary of employee per month is : "+inHandSalary);
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the basic salary of employee");
		int basic = sc.nextInt();
		System.out.println("enter the BOA salary of employee");
		int boa = sc.nextInt();
		System.out.println("enter the job level salary of employee");
		int level = sc.nextInt();
		
		Salary_Assignment emp = new Salary_Assignment(basic, boa, level);
		emp.printTakeHomeSalary();
		
	
		Salary_Assignment emp1 = new Salary_Assignment (7000, 5000, 1);
		 emp1.basic=7000;
		 emp1.boa=5000;
		 emp1.emplevel=1;
		emp1.printTakeHomeSalary();
		
		Salary_Assignment emp2 = new Salary_Assignment(10000, 7000, 2);
		emp2.printTakeHomeSalary();
		
		Salary_Assignment emp3 = new Salary_Assignment(12000, 9000, 3);
		emp3.printTakeHomeSalary();
		
		Salary_Assignment emp4 = new Salary_Assignment(15000, 10000, 4);
		emp4.printTakeHomeSalary();
}
	
}
	
	
	
	
	
