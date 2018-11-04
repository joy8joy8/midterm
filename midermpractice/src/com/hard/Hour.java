package com.hard;

import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter how many seconds in total?");		
		int second=scanner.nextInt();
		scanner.nextLine();
		Second a =new Second(second);
		a.result();

	}

}
