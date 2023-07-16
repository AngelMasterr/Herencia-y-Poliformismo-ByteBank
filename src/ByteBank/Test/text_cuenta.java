package ByteBank.Test;

import ByteBank.Modelo.CuentaAhorros;
import ByteBank.Modelo.CuentaCorriente;

public class text_cuenta {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		
		cc.depositar(5000);
		System.out.println(cc.getSaldo());
		
		cc.transferir(2000, ca);		
		System.out.println(ca.getSaldo());
		System.out.println(cc.getSaldo());
		
	}

}
