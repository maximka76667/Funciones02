package ej11_mcm_de_3;

import java.util.Scanner;

public class Main11 {

	public static int calcularMCM(int numero1, int numero2) {
		for(int i = 1; i <= numero1 * numero2; i++) if(i % numero1 == 0 && i % numero2 == 0) return i;
		return 1;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int numero2 = entrada.nextInt();
		System.out.print("Numero 3: ");
		int numero3 = entrada.nextInt();

		System.out.println("MCD: " + calcularMCM(calcularMCM(numero1, numero2), numero3));
		
		entrada.close();
	}

}
