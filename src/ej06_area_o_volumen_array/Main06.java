package ej06_area_o_volumen_array;

import java.util.Scanner;

public class Main06 {
	public static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	public static double calcularVolumen(double radio, double altura) {
		return calcularArea(radio) * altura;
	}
	
	public static double[] calcular(double radio, double altura) {
		double[] resultado = new double[2];
		
		resultado[0] = calcularArea(radio);
		resultado[1] = calcularVolumen(radio, altura);
		
		return resultado;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double radio;

		System.out.print("Radio: ");
		radio = entrada.nextDouble();
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double[] resultado = calcular(radio, altura);

		System.out.println("Area: " + resultado[0]);
		System.out.println("Volumen: " + resultado[1]);

		entrada.close();
	}

}
