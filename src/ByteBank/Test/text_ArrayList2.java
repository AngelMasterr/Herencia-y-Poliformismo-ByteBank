package ByteBank.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import ByteBank.Modelo.Cliente;
import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;

public class text_ArrayList2 {
	
	public static void main(String[] args) {
		
		// LinkedList: crea una lista doblemente enlazada, lo que permite mejorara el rendimiento al agregar o elimiar un valor de la lista.
		// <Cuenta> estoy forzando a que la List solo acepte el tipo de objeto "Cuenta", es recomendable indicar el tipo de objeto que manejara el array
		List<Cliente> lista_cliente = new LinkedList<>(); 
		List<Cuenta> lista_cuenta = new LinkedList<>(); 		
		
		Cuenta cc1 = new CuentaCorriente(1, 101);
		Cuenta cc2 = new CuentaCorriente(2, 102);
		Cuenta cc3 = new CuentaCorriente(1, 101);
		Cliente cleinte1 = new Cliente();
		
		lista_cuenta.add(cc1);
		lista_cuenta.add(cc2);
		// lista.add(cliente1); No puedo agregar al array un objeto diferente a Cuenta debdio a que ya declare el array con ese objeto
		
		Cuenta obtener_cuenta = lista_cuenta.get(0);
		System.out.println(obtener_cuenta);
		
		for (int i = 0; i < lista_cuenta.size(); i++) {
			System.out.println(lista_cuenta.get(i));
		}
		// for each: por cada cuenta que este en la lista se imprime
		for (Cuenta cuenta : lista_cuenta) {
			System.out.println(cuenta);
		}
		// contain: retorna un boolean, si el array contiene o no el valor
		if ( lista_cuenta.contains(cc1)){
			System.out.println("la lista contiene ese objeto "+cc1);
		}else {
			System.out.println("la lista no contiene ese objeto "+cc1);
		}
		
		// corrobora con el metodo esIgual si en numero y la agencia son iguales en esas dos cuentas cc1 y cc3
		if (cc1.esIgual(cc3)) {
			System.out.println("si son cuentas iguales");
		}		
		
		
	}

}

