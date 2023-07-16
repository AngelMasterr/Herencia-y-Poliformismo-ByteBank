package ByteBank.Test;

import ByteBank.Modelo.Gerente;

public class text_gerente {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNombre("Eduardo");
		gerente.setDocumento("999666333");
		gerente.setSalario(5000);	
		gerente.setTipo(1);
		gerente.setClave("aluraonline");
		
		System.out.println(gerente.getBonificacion());	
		System.out.println(gerente.iniciarSecion("aluraonline"));
		
	}

}
