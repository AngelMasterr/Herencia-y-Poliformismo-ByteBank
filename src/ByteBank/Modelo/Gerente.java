package ByteBank.Modelo;

// extends: extiende los atributos de otra clase "Funcionario" para si mismo

public class Gerente extends Funcionario implements Autenticable {
		
	// la bonificacion del gerente es un salario mas el 10%
	// sobre-escritura de metodo, ya que la clase padre tiene un mismo metodo
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + (super.getSalario()*0.1);
	}
 
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSecion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
