package ej12_amigos;

import java.util.Scanner;

public class Main12 {
	
	public static boolean siAmigos(int numero1, int numero2) {
		int suma1 = calcularSumaDivisores(numero1);
		
		if(suma1 == numero2) {
			int suma2 = calcularSumaDivisores(numero2);
			if(suma2 == numero1) return true;
		}
		
		return false;
	}
	
	public static int calcularSumaDivisores(int numero) {
		int suma = 0;
		for(int i = 1; i < numero; i++) if(numero % i == 0) suma += i;
		return suma;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int numero2 = entrada.nextInt();

		System.out.println(siAmigos(numero1, numero2) ? "Son amigos" : "No son amigos");
		
		entrada.close();
	}

}
