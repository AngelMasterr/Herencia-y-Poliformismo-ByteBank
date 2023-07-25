package ByteBank.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;

public class text_OrdenarListaNumero {
	
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
		
		// Ordenar las Cuentas implementando Comparaton a nivel de parametro		
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});		
		// Comprobara que si ordeno las cuentas
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}		
	}
}