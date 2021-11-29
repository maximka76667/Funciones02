package ej18_buscar_en_array;

import java.util.Arrays;

public class Main18 {

	public static boolean buscarNumero(int[] numeros, int numero_buscando) {

		// Con bucle for
		//		for(int i = 0; i < numeros.length; i++) if(numeros[i] == numero_buscando) return true;
		//		return false;

		// Binary Search
		Arrays.sort(numeros);
		int left = 0;
		int right = numeros.length - 1;

		while(left <= right) {
			int middle = (left + right) / 2;
			if(numeros[middle] == numero_buscando) return true;
			else if(numero_buscando > numeros[middle]) left = ++middle;
			else if(numero_buscando < numeros[middle]) right = --middle;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numeros = {30, 40, 50, 3, 8};
		int numero_buscando = 50;
		System.out.print("Número " + numero_buscando + " ");
		System.out.println(buscarNumero(numeros, numero_buscando) ? "se he encontrado" : "no se he encontrado");
	}

}
