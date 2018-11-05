package com.hard;

public class Ticket {
int oneway;
int roundtrip;
public Ticket(int oneway,int roundtrip) {
	this.oneway=oneway;
	this.roundtrip=roundtrip;
}
public void price() {
	int a=oneway*100;
	int b=roundtrip*180;
	int c=a+b;
	System.out.printf("One way ticket: %d  Round trip ticket: %d  Total price: %d ",oneway,roundtrip,c);
}
}
