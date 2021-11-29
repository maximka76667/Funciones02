package ej07_divisores_primos;

import java.util.Scanner;

public class Main07 {
	
	public static int countDividers(int numero) {
		int cantidad_divisores = 0;
		for(int i = 1; i < numero; i++) if(numero % i == 0) ++cantidad_divisores;
		return cantidad_divisores;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número: ");
		int numero = entrada.nextInt();
		
		System.out.println("Divisores primos: " + countDividers(numero));
		
		entrada.close();
	}

}
