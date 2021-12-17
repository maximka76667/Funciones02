package ej20_la_primitiva;

public class Main20 {

	public static void main(String[] args) {
		final int NUMERO_MAXIMO = 100;
		int[] apuesta = generarArray(6, NUMERO_MAXIMO);
		int[] ganadores = generarArray(6, NUMERO_MAXIMO);
		
		// Print apuesta
		System.out.println("Apuesta: ");
		printArray(apuesta);
		
		// Print ganadores
		System.out.println("\n");
		System.out.println("Ganadores: ");
		printArray(ganadores);
		
		// Print ciertos
		System.out.println("\n");
		System.out.println("Ciertos: " + la_primitiva(apuesta, ganadores));
	}
	
	public static int[] generarArray(int arrayLength, int numeroMaximo) {
		int[] array = new int[arrayLength];
		
		for(int i = 0; i < array.length; i++) {
			int numero;
			do {
				numero = generarNumero(numeroMaximo);
			} while(checkRepeticiones(array, numero));
			
			array[i] = numero;
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int generarNumero(int max) {
		return (int) Math.floor(Math.random() * max);
	}
	
	// Si numero ya está en array return true
	public static boolean checkRepeticiones(int[] array, int numero) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == numero) return true;
		}
		return false;
	}
	
	public static int la_primitiva(int[] apuesta, int[] ganadores) {
		int ciertos = 0;
		
		for(int i = 0; i < apuesta.length; i++) {
			for(int j = 0; j < ganadores.length; j++) if(apuesta[i] == ganadores[j]) ++ciertos;
		}
		
		return ciertos;
	}

}
