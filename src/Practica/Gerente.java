package Practica;

public class Gerente {
	
	private String nombre;
	private String documento;
	private double salario;
	
	// creando constructor
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	
	// creando getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// la bonificacion del gerente es un salario completo
	public double getBonificación() {
		return this.salario * 1;
	}
	
}
