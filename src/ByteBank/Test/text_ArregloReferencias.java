package ByteBank.Test;

import ByteBank.Modelo.CuentaCorriente;

public class text_ArregloReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1, 1221);
		// creando un array de la clase CuentaCorriente
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[0] = cc;
		cuentas[1] = new CuentaCorriente(2, 1222);
		cuentas[2] = new CuentaCorriente(3, 1223);
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}

}

