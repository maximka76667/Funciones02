package ej13_binario;

import java.util.Scanner;

public class Main13 {
	
	public static String convertirBinario(int numero) {
		String result = "";

		while(numero != 0) {
			result = Math.abs(numero % 2) + result;
			numero /= 2;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero 1: ");
		int numero = entrada.nextInt();
		
		System.out.println(numero + " en binario es: " + convertirBinario(numero));

		entrada.close();
	}

}
