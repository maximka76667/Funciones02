package maximo_array_ej02;

public class Main02 {
	
	public static double maximo(double[] numeros) {
		double num_maximo = numeros[0];
		for(int i = 1; i < numeros.length; i++) if(numeros[i] > num_maximo) num_maximo = numeros[i];
		return num_maximo;
	}

	public static void main(String[] args) {
		
		final int cantidad = 10;
		
		double[] numeros = new double[cantidad];
		
		// Generate array with numbers between -25 and 25
		for(int i = 0; i < cantidad; i++) numeros[i] = Math.floor((Math.random() * 50) - 25);
		
		// Print array
		for(int i = 0; i < numeros.length; i++) System.out.print(numeros[i] + " \n");

		// Result
		System.out.print("Número máximo: " + maximo(numeros));
	}

}
