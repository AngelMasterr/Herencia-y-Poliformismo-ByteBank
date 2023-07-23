package ByteBank.Test;

public class text_main {
	
	public static void main(String[] args) {
		
		// que significa "args" del array Srtring[] en el main?
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i);
		}
		
		int edad1 = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		// crear un array para agrupar varios datos
		
		int[] edades = new int[5]; // se creo un array con 5 posiciones todas iniciadas en cero "0"
		edades[2] = 30; // en la tercera posicion del array tiene el valor de 30
		edades[0] = 10;
		edades[4] = 50;
		
		int tamaño_array = edades.length;
		System.out.println(tamaño_array);  // longitud o tamaño del array
		
		for (int i = 0; i < tamaño_array; i++) {
			System.out.println(edades[i]);
		}
			
	}

}

