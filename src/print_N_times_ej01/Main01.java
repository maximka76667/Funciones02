package print_N_times_ej01;

import java.util.Scanner;

public class Main01 {
	
	public static void printN(int N, String mensaje) {
		for(int i = 0; i < N; i++) System.out.println(mensaje);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Número: ");
		int N = entrada.nextInt();

		printN(N, "Módulo ejecutándose");

		entrada.close();
	}
}
