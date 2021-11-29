package ej14_suma_n_impares;

import java.util.Scanner;

public class Main14 {

	public static int sumarNImpares(int N) {
		int suma = 0;

		for(int i = 1; i <= N; i++) {
			if(i % 2 == 0) N += 1;
			else suma += i;
		}
		
		return suma;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("N: ");
		int N = entrada.nextInt();

		System.out.println(sumarNImpares(N));

		entrada.close();
	}

}
