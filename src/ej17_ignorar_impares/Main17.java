package ej17_ignorar_impares;

import java.util.Scanner;

public class Main17 {

	public static void rellenarArraySinImpares(int[] numeros) {
		Scanner entrada = new Scanner(System.in);
		int cantidad_ignorados = 0;
		int N = numeros.length;
		
		for(int i = 0; i < N; i++) {
			System.out.print("Nuevo número: ");
			int numero = entrada.nextInt();
			if(numero % 2 == 0) numeros[i] = numero;
			else {
				N--;
				i--;
				cantidad_ignorados++;
			}
		}
		
		entrada.close();

		int[] numeros_nuevos = new int[N];
		for(int i = 0; i < N; i++) numeros_nuevos[i] = numeros[i];

		System.out.println("Array final (impares son ignorados): ");

		for(int i = 0; i < numeros_nuevos.length; i++) System.out.print(numeros_nuevos[i] + " ");

		System.out.println("\nCantidad ignorados: " + cantidad_ignorados);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Cuantos números: ");
		int N = entrada.nextInt();

		int[] numeros = new int[N];
		
		rellenarArraySinImpares(numeros);

		entrada.close();
	}

}
