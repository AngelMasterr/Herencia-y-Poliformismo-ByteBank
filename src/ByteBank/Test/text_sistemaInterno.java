package ByteBank.Test;

import ByteBank.Modelo.Administrador;
import ByteBank.Modelo.Gerente;
import ByteBank.Modelo.SistemaInterno;

public class text_sistemaInterno {
	
	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente_1 = new Gerente();
		Administrador andmin_1 = new Administrador();
		
		sistema.autentica(gerente_1);
		sistema.autentica(andmin_1);
	}

}
