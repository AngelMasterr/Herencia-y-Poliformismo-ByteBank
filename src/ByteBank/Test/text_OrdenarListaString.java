package ByteBank.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ByteBank.Modelo.Cliente;
import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaAhorros;
import ByteBank.Modelo.CuentaCorriente;

public class text_OrdenarListaString {
	
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Cuenta ca2 = new CuentaAhorros(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		ca2.setTitular(clienteCC2);
		ca2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);

		Cuenta ca4 = new CuentaAhorros(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		ca4.setTitular(clienteCC4);
		ca4.depositar(222.0);	
		
		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);
		
		// Ordenar las Cuentas por el nombre usando la clase que creamos abajo
		lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado
		
		for (Cuenta cuenta : lista) {
		    System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
		}
		
		// Ordenar las Cuentas por el nombre usando el metodo a nivel de parametro
		lista.sort(new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}				
		});
		System.out.println("ordenando con el metodo a nivel de parametro");
		for (Cuenta cuenta : lista) {
		    System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());
		}
	}
}
//Crear la clase para ordenar las cuentas por su nombre, usando el implements "Comparator"
class TitularDeCuentaComparator implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        String nombreC1 = c1.getTitular().getNombre();
        String nombreC2 = c2.getTitular().getNombre();
        return nombreC1.compareTo(nombreC2);
    }
}

