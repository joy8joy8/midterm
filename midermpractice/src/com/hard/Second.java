package com.hard;

public class Second {
	int second;

	public Second(int second) {
		this.second = second;
	}
	public void result() {
		int hour=second/3600;
		int minute=(second-(hour*3600))/60;
		int second2=second%60;
		System.out.println(second+" second = "+hour+" hours, "+minute+" minutes, and "+second2+" seconds");
	}
}
