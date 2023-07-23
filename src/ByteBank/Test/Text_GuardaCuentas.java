package ByteBank.Test;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;
import ByteBank.Modelo.GuardaCuentas;

public class Text_GuardaCuentas {
	
	public static void main(String[] args) {
		
		GuardaCuentas guarda_cuentas = new GuardaCuentas();
		Cuenta cc1 = new CuentaCorriente(1, 12);		
		guarda_cuentas.adicionar(cc1);
		Cuenta cc2 = new CuentaCorriente(2, 14);		
		guarda_cuentas.adicionar(cc2);
		
		System.out.println(guarda_cuentas.obtener(0));
		System.out.println(guarda_cuentas.obtener(1));
		
				
		
	}

}

