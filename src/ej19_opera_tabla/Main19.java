package ej19_opera_tabla;

import java.util.Scanner;

public class Main19 {
	public static double[] opera_tabla(double[] array1, double[] array2, int elem_utiles, char opera) {
		double[] array3 = new double[elem_utiles];
		
		for(int i = 0; i < array3.length; i++) {
			switch (opera) {
			case 's':
				array3[i] = array1[i] + array2[i];
				break;
				
			case 'r':
				array3[i] = array1[i] - array2[i];
				break;
				
			case 'm':
				array3[i] = array1[i] * array2[i];
				break;
				
			case 'd':
				array3[i] = array1[i] / array2[i];
				break;

			default:
				break;
			}
		}
		
		return array3;
	}

	public static void main(String[] args) {
		
		// Entrada
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros1 = {10, 20, 50, -10};
		double[] numeros2 = {30, 50, 10, -5};
		int longitud_maxima = Math.max(numeros1.length, numeros2.length);
		
		System.out.print("Operación: ");
		char opera = entrada.nextLine().charAt(0);
		
		System.out.print("Elementos útiles: ");
		int elem_utiles = entrada.nextInt();
		
		// Check if elem_utiles no es más que es posible
		if(elem_utiles > longitud_maxima) elem_utiles = longitud_maxima;
		
		// Crear array3
		double[] numeros3 = opera_tabla(numeros1, numeros2, elem_utiles, opera);
		
		// Print array3
		for (int i = 0; i < numeros3.length; i++) System.out.println(numeros3[i]);
		
		entrada.close();
	}

}
