package ByteBank.Test;

import java.util.ArrayList;
import java.util.List;

public class text_Wrappers {
	
	public static void main(String[] args) {
		
		Boolean boleano = true;	//autoboxing
		Double numero_double1 = 30.0; //autoboxing: convierte automaticamente primitivo "double" al objeto "Double"				
		Double numero_double2 = Double.valueOf(40); // convierte el int 40 al double 40.0
		Double numero_double3 = Double.valueOf("50"); // convierte el string "50" al double 50.0
		Integer numero_integer1 = Integer.valueOf("60"); // convierte el string "60" al int 60.0
		
		// Number: es el padre de todos los objetos que trabajan con numeros
		Number numero = Integer.valueOf(70); 
		double numero_prim = numero.doubleValue();
		
		List<Number> lista = new ArrayList<>();
		lista.add(numero_double1);
		lista.add(numero_double2);
		lista.add(numero_double3);
		lista.add(numero_integer1);
		lista.add(numero);
		lista.add(numero_prim);		
		System.out.println(lista);
		
		
		
	}

}

