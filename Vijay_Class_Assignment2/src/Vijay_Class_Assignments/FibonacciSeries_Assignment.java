package Vijay_Class_Assignments;

import java.util.Scanner;

public class FibonacciSeries_Assignment {

	public static void main(String[] args) {
		 
		 // fib series 0 1 1 2 3 5 8 13 21 ....
		 
	    int n, 
		a=0,b=1,c;
		System.out.print("enter n");	
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
		for(int i=1;i<n;i++) {	
		System.out.print(a+"  ");	
			c=a+b;
			a=b;
			b=c;
		}
		
		}	
}
