package com.iconsultus.coding;

import java.util.Scanner;

public class CheckPassFail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks for the student");
		Scanner in = new Scanner(System.in);
		int marks = in.nextInt();
		print(marks);
		
	}
	
	public static void print(int marks) {
		if (marks >= 50) {
			System.out.println("Pass");
		}
		else
			System.out.println("fail");
	}

}
