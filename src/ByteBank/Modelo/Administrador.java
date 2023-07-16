package ByteBank.Modelo;

public class Administrador extends Funcionario implements Autenticable {

	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Administrador");
		return this.getSalario()*0.2;
	}

	private String clave;
	
	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}	
	@Override
	public boolean iniciarSecion(String clave) {
		return this.clave == clave;			
	}
	
}
