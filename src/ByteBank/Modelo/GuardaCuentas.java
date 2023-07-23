package ByteBank.Modelo;

public class GuardaCuentas {
	
	// Crear un objeto para guardar varias cuentas
	// Permitir agregar cuentas con un metodo
	// guarda_cuentas.adiciona(cuenta);
	// obtener, asignar, remover, etc.
	
	Cuenta[] cuenta = new Cuenta[10];

	int indice = 0;
	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;
		indice ++;		
	}
	
	public Cuenta obtener(int indice) {
		return cuenta[indice];		
	}

}

