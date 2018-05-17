package com.sapient.logicals;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

		String us = usFormat.format(payment);
		String india = inFormat.format(payment);


		System.out.println("US: " + us);
		System.out.println("India: " + india);
	}

}
