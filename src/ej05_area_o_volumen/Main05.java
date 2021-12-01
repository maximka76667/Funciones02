package ej05_area_o_volumen;

import java.util.Scanner;

public class Main05 {
	
	public static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double calcularVolumen(double radio, double altura) {
		return calcularArea(radio) * altura;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Calcular area o volumen (a/v): ");
		char tipo = entrada.nextLine().charAt(0);
		
		double radio;
		String resultado;

		switch (tipo) {
		case 'a':
			System.out.print("Radio: ");
			radio = entrada.nextDouble();
			resultado = Double.toString(calcularArea(radio));
			break;
			
		case 'v':
			System.out.print("Radio: ");
			radio = entrada.nextDouble();
			System.out.print("Altura: ");
			double altura = entrada.nextDouble();
			resultado = Double.toString(calcularVolumen(radio, altura));
			break;

		default:
			resultado = "Error";
			break;
		}

		System.out.println("Resultado: " + resultado);

		entrada.close();
	}

}
