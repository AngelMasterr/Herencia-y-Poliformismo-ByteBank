package ByteBank.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;

public class text_Lambda {   	
		
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(1, 104);
		cc1.depositar(100);
		
		Cuenta cc2 = new CuentaCorriente(2, 102);
		cc1.depositar(200);
		
		Cuenta cc3 = new CuentaCorriente(3, 101);
		cc1.depositar(300);
		
		Cuenta cc4 = new CuentaCorriente(4, 103);
		cc1.depositar(400);
		
		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		// Ordenar las Cuentas por numero implementando Lambda -> (envia los parametros directo a la funcion)		
		lista.sort((o1,  o2) -> 
				Integer.compare(o1.getNumero(), o2.getNumero())
		);				
		// Comprobara que si ordeno las cuentas
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// vamos a usar forEach como metodo de lista para imprimir
		System.out.println("usando lista.forEach para imprimir");
		
		lista.forEach(cuenta ->	System.out.println(cuenta));
		
	}
}
	