package Practica;

public class text_gerente {
	
	public static void main(String[] args) {
		
		//Gerente gerente = new Gerente();
		
		Funcionario gerente = new Funcionario();
		gerente.setNombre("Eduardo");
		gerente.setDocumento("999666333");
		gerente.setSalario(5000);	
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());		
		
	}

}
