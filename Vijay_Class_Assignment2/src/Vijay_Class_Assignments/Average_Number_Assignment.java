package Vijay_Class_Assignments;

import java.util.Scanner;

public class Average_Number_Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("marks of four student");
		int s1,s2,s3,s4;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		int total=s1+s2+s3+s4;
		System.out.println("students total marks" + total);
		double avg= total/4.0;
		System.out.println("avgerage marks"+ avg);
		  }
		}

