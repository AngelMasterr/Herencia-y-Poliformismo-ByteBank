package Practica;

public class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

	// creando el constructor
	public Funcionario() {
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
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// la bonificacion del funcionario es el 10% del salario
	// la bonificacion del gerente es el 100% del salario	

	public double getBonificacion() {
		if ( this.tipo == 0 ) {
			return this.salario * 0.1;
		}else if (this.tipo == 1){
			return this.salario * 1;
		}else {
			System.out.println("El valor de tipo debe ser 1 o 0");
			return 0;			
		}			
	}				
}
