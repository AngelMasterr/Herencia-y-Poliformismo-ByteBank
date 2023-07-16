package ByteBank;

public class text_controlBonificacion {
	
	public static void main(String[] args) {
		
		Funcionario Angel = new Contador();
		Angel.setSalario(1000);
		
		Gerente Jimena = new Gerente();
		Jimena.setSalario(5000);
		
		Contador Camilo = new Contador();
		Camilo.setSalario(2000);
		
		controlBonificacion controlBonificacion = new controlBonificacion();
		controlBonificacion.registrarSalario(Angel);
		controlBonificacion.registrarSalario(Jimena);
		controlBonificacion.registrarSalario(Camilo);
		
	}

}
