package ByteBank.Test;

import java.util.ArrayList;

import ByteBank.Modelo.Cliente;
import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;

public class text_ArrayList {
	
	public static void main(String[] args) {
		
		// <Cuenta> estoy forzando a que el array solo acepte el tipo de objeto "Cuenta"
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>(); 
		Cuenta cc1 = new CuentaCorriente(1, 101);
		Cuenta cc2 = new CuentaCorriente(2, 102);
		Cliente cleinte1 = new Cliente();
		
		lista.add(cc1);
		lista.add(cc2);
		// lista.add(cliente1); No puedo agregar al array un objeto deferente a Cuenta
		
		Cuenta obtener_cuenta = lista.get(0);
		System.out.println(obtener_cuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		// for each: por cada cuenta que este en la lista se imprime
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		
	}

}

