package Practica;

public class text_referencias {
	
	public static void main(String[] args) {
		
		// un objeto padre se puede crear con una clase hijo
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		// péro un objeto hijo no se puede crear con una clase padre
		Gerente gerente = new Funcionario(); // new Gerente
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(1000);
		gerente.setSalario(5000);
		
	}

}
