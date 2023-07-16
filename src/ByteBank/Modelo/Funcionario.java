package ByteBank.Modelo;

// abstrac: crea una clase abstracta, la cual solo puede ser utilzada para crear clases hijos como "Gerente" o "Contador"
// los objetos no pueden ser creados con esta clase, solo con las clases hijos
public abstract class Funcionario {

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

	// al ser un metodo abstracto, obliga a que todas las clases hijas realizen un metodo getBonificación para que pueda funcionar
	public abstract double getBonificacion();
}
