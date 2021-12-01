package ej03_print_entre_N_y_K;

import java.util.Scanner;

public class Main03 {
	
	public static void printEntre(int N, int K) {
		for(int i = N; i <= K; i++) System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Número N: ");
		int N = entrada.nextInt();
		
		System.out.print("Número K: ");
		int K = entrada.nextInt();

		printEntre(N, K);

		entrada.close();
	}

}
