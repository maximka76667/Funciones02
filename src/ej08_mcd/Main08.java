package ej08_mcd;

import java.util.Scanner;

public class Main08 {
	
	public static int calcularMCD(int numero1, int numero2) {
		for(int i = numero1; i > 0; i--) if(numero1 % i == 0 && numero2 % i == 0) return i;
		return 1;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int numero2 = entrada.nextInt();

		System.out.println("MCD: " + calcularMCD(numero1, numero2));
		
		entrada.close();
	}

}
