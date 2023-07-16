package ByteBank;

public class text_funcionario {
	
	public static void main(String[] args) {
		
		Funcionario Angel = new Contador();
		Angel.setNombre("Angel");
		Angel.setDocumento("123456789");
		Angel.setSalario(2000);
		Angel.setTipo(0);
		
		System.out.println(Angel.getSalario());
		System.out.println(Angel.getBonificacion());
		
	}

}
