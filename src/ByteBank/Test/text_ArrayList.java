package ByteBank.Test;

import java.util.ArrayList;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;

public class text_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		Cuenta cc1 = new CuentaCorriente(1, 101);
		Cuenta cc2 = new CuentaCorriente(2, 102);
		
		lista.add(cc1);
		lista.add(cc2);
		
		Cuenta obtener_cuenta = (Cuenta) lista.get(0);
		System.out.println(obtener_cuenta);
		
		
	}

}

