package ej15_angulo;

import java.util.Scanner;

public class Main15 {
	
	public static void mostrarFuncionesTrigo(double angulo) {
		double anguloInRadian = Math.toRadians(angulo);
		System.out.println(Math.round(Math.sin(anguloInRadian) * 100) / 100.0);
		System.out.println(Math.round(Math.cos(anguloInRadian) * 100) / 100.0);
		System.out.println(Math.round(Math.tan(anguloInRadian) * 100) / 100.0);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ángulo: ");
		double angulo = entrada.nextInt();

		mostrarFuncionesTrigo(angulo);

		entrada.close();
	}

}
