package ByteBank.Test;

import ByteBank.Modelo.Cuenta;
import ByteBank.Modelo.CuentaAhorros;
import ByteBank.Modelo.CuentaCorriente;

public class text_ArregloReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1, 1221);
		// creando un array de la clase CuentaCorriente
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[0] = cc;
		cuentas[1] = new CuentaCorriente(2, 1222);
		cuentas[2] = new CuentaCorriente(3, 1223);
				
		CuentaAhorros ca = new CuentaAhorros(4, 3120);
		cuentas[3] = ca; //el array debe ser de la misma clase o ser padre de la clase
		
		// Cast: darla valor a una variable desde un array de clase padre
		CuentaCorriente cc2 = (CuentaCorriente) cuentas[2];
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		System.out.println(cc2);
		
	}

}

