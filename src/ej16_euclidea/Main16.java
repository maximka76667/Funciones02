package ej16_euclidea;

import java.util.Scanner;

public class Main16 {
	
	public static double calcularEuclidea(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("X1: ");
		int x1 = entrada.nextInt();
		System.out.print("Y1: ");
		int y1 = entrada.nextInt();
		System.out.print("X2: ");
		int x2 = entrada.nextInt();
		System.out.print("Y2: ");
		int y2 = entrada.nextInt();
		
		System.out.println("Distancia euclídea: " + calcularEuclidea(x1, y1, x2, y2));

		entrada.close();
	}

}
