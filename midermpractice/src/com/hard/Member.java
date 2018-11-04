package com.hard;

import java.util.Scanner;

public class Member {
	
	boolean adult;
	int age;
	String email;
	String name;
	Scanner scanner=new Scanner(System.in);
	public Member(boolean adult) {
	this.adult=adult;
	}
	public Member(String name,int age,String email) {
		this.name=name;
		this.age=age;
		this.email=email;
		}
	public void creat() {
		System.out.println("Please enter your name.");
		String name=scanner.nextLine();
		System.out.println("Please enter your email.");
		String email=scanner.nextLine();
		System.out.println("Your information:"+name+"\t"+email);
	}
}
