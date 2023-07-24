package ByteBank.Test;

import java.util.ArrayList;
import java.util.List;

import ByteBank.Modelo.Cuenta;

public class text_RepasoArray {

	public static void main(String[] args) {
		
		// tipos de arreglos
		int numeros1[] = new int[5]; // se debe especificar el tamaño
		int numeros2[] = {1,2,3,4,5};
		
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			lista.add(i);
		}
		// agrega en la posicion 5 el numero 24, la posicion debe estar dentro del tamaño(size) del array
		lista.add(5, 24);
		System.out.println(lista);
		
		// los argumentos primitivos (int, double, byte, etc) no son objetos, por eso es necesario trabajar con wrappers
		// integer es el objeto para los numeros enteros
		
		Integer numero_objeto1 = Integer.valueOf("40");
		Integer numero_objeto2 = Integer.valueOf(45);
		int numero = 50;
		lista.add(numero_objeto1);
		lista.add(numero_objeto2);
		lista.add(numero);
		
		// convertir un objeto integer a otro 
		byte numero_byte = numero_objeto1.byteValue();
		double numero_double = numero_objeto1.doubleValue();
		System.out.println(lista);
		
		System.out.println(Integer.MAX_VALUE); // max valor que soporta
		System.out.println(Integer.MIN_VALUE); // min valor que soporta
		System.out.println(Integer.SIZE); //bits
		System.out.println(Integer.BYTES);//bytes
		
		
	}
}

