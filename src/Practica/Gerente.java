package Practica;

// extends: extiende los atributos de otra clase "Funcionario" para si mismo

public class Gerente extends Funcionario {
	
	private String clave;	
	public void setClave(String clave) {
		this.clave = clave;
	}	
	public boolean iniciarSecion(String clave) {
		return clave == this.clave;
	}
	
	// la bonificacion del gerente es un salario mas la bonificacion
	// sobre-escritura de metodo, ya que la clase padre tiene un mismo metodo
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + (super.getSalario()*0.1);
	}
}
