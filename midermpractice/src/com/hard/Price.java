package com.hard;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many one way tickets do you want?(1/100NT) If you don't need any please enter 0.");
		int a=scanner.nextInt();
		scanner.nextLine();
		System.out.println("How many round trip tickets do you want?(1pair/180NT) If you don't need any please enter 0.");
		int b=scanner.nextInt();
		scanner.nextLine();
		Ticket one=new Ticket(a,b);
		one.price();
	}

}
