package com.hard;
public class Ramdon {
	
	int correct;
	int g;

	public Ramdon(int correct, int g) {
		this.correct = correct;
		this.g = g;
	}

	/* public int g() { 
	   System.out.println("Your number:"); 
	   int g = scanner.nextInt(); 
	   scanner.nextLine(); 
	   return g; }
	 */

	public void number() {
		if (g > correct) {
			System.out.print("Please guess a number below " + g + "\n" + "Your number: ");
		} else if (g < correct) {
			System.out.print("Please guess a number over " + g + "\n" + "Your number: ");
		}
	}
}
