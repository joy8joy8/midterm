package com.hard;

public class Student {

	String name;
	int english;
	int math;
	
	public Student(String name,int english,int math){
		this.name=name;
		this.english=english;
		this. math=math;
	}
	public int even() {
		int even=(english+math)/2;
		return even;
	}
	public void result() {	
		System.out.println(name+"  english score:"+english+"  math score:"+math+"  even:"+even() );
		
	}
}
