package com.hard;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int correct = random.nextInt(100) + 1;
		System.out.println(correct);
		System.out.println("please choose a number from 1 to 100.");

		while (true) {
			int g = scanner.nextInt();
			scanner.nextLine();
			Ramdon ramdon = new Ramdon(correct, g);
			if (g != correct) {
				ramdon.number();
			} else {
				System.out.println("Correct!! Well done!");
				break;
			}
		}

	}

}