package Vijay_Class_Assignments;

import java.util.Scanner;

public class LeapYear_Assignment {


public static void main(String[] args){
	
	// in year    (y%4= 0 and y%100!=0) leap year, if not then not leap year
	// in century (y%400= and y%100=0) leap year, if not then not leap year
    
     int y;
     System.out.println("enter year");
     Scanner sc= new Scanner(System.in);
     y=sc.nextInt();
     
   if  (y%100==0 && y%400==0 || y%4==0 && y%100!=0)
     {
     System.out.println("leap year");
     }
   else
   {
	System.out.println(" not leap year");   
   }
}
}
