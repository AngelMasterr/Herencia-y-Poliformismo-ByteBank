package ByteBank.Test;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaCorriente;
import ByteBank.Modelo.GuardaCuentas;
import ByteBank.Modelo.GuardaReferencias;

public class Text_GuardaReferencias {
	
	public static void main(String[] args) {
		
		GuardaReferencias guarda_referencias = new GuardaReferencias();
		Cuenta cc1 = new CuentaCorriente(1, 12);		
		guarda_referencias.adicionar(cc1);
		Cuenta cc2 = new CuentaCorriente(2, 14);		
		guarda_referencias.adicionar(cc2);
		
		System.out.println(guarda_referencias.obtener(0));
		System.out.println(guarda_referencias.obtener(1));
		
				
		
	}

}

