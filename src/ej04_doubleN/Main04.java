package ej04_doubleN;

import java.util.Scanner;

public class Main04 {
	
	public static double doubleN(double N) {
		return N * 2;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("N�mero: ");
		double N = entrada.nextDouble();

		System.out.println("N�mero doble: " + doubleN(N));

		entrada.close();
	}

}