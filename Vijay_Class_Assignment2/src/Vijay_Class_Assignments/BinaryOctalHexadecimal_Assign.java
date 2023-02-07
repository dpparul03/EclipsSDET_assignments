package Vijay_Class_Assignments;

import java.util.Scanner;

public class BinaryOctalHexadecimal_Assign {
	public static void main(String[] args) {
		int decimal;
	    String binary,octal,hexadecimal;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter decimal ");	
		decimal=sc.nextInt();

		binary=Integer.toBinaryString(decimal);
		octal=Integer.toOctalString(decimal);
		hexadecimal=Integer.toHexString(decimal);
	  System.out.println("Binary : "+binary+" Octal : "+octal+" Hexadecimal : "+hexadecimal);

		}
}
