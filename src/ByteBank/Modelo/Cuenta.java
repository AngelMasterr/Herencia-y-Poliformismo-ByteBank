package ByteBank.Modelo;

//abstrac: crea una clase abstracta, la cual solo puede ser utilzada para crear clases hijos como "Gerente" o "Contador"
//los objetos no pueden ser creados con esta clase, solo con las clases hijos
public abstract class Cuenta {
	protected double saldo; // protected: solo es accesible desde sus clases hijas
	private int agencia;	// private: solo es accesible desde este archivo.
	private int numero;
	private Cliente titular; // tipo de dato de titular es Cliente, hace referencia a la clase Cliente

	private static int total = 0;

	public Cuenta(int agencia, int numero) { // este constructor obliga a que esta clase inicialice con estos atributos
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta "+ this.numero);
		
		total++;		
	}
	
	// void: metodo que no retorna valor, solo ejecuta
	// al ser abstract este metodo obliga a que todos sus hijos tenan un metodo de depositar.
	public abstract void depositar(double valor);
	

	// boolean: metodo que retorna dos valores (ej: true o false)
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// boolean: metodo que retorna dos valores (ej: true o false)
	public boolean transferir(double valor, Cuenta nameCuenta) {			
		if (this.saldo >= valor) {
			this.saca(valor);	
			nameCuenta.depositar(valor);
			return true;
		}else {
			System.out.println("No hay dinero suiciente para la transaccion");
			return false;
		}				
	}
	
	public boolean saca(double valor) {
		this.saldo -= valor;	 		
		return true;
	
	}

	// debdio a que la variable saldo es privada y no se puede acceder desde otra
	// referencia se realiza este metodo
	// get: es un termino que usan los programadores para obtener el valor de una
	// variable
	public double getSaldo() {
		return this.saldo;
	}

	// las variables son privadas, debido a eso es necesario crear metodos en este
	// archivo para acceder
	// void: es para metodos que no devuelven nada
	// set: es un termino que usan los programadores para asignar una variable
	public void setAgencia(int new_agencia) {
		if (new_agencia > 0) {
			this.agencia = new_agencia;
		} else {
			System.out.println("No esta permitido valores negativos");
		}
	}

	// en el metodo anterior asiganmos el valor a agencia, pero al ser void no
	// retorna nada, por eso se debe usar este metodo para obtener el valor
	public int getAgencia() {
		return agencia;
	}

	// crear metodo para la referencia Cliente
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

}
