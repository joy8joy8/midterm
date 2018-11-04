package com.hard;

import java.util.Scanner;

public class Sing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Are you 20?N/Y");
		String a=scanner.nextLine();
		boolean adult=a.equalsIgnoreCase("y");
		System.out.println(adult);
		Member member=new Member(adult);
		if(adult) {
			member.creat();
		}else {
			System.out.println("sorry,bye");
		}
	}

}
