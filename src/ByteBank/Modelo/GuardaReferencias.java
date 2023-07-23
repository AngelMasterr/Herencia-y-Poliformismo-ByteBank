package ByteBank.Modelo;

public class GuardaReferencias {	
	
	// Crear un objeto para guardar varias cuentas
	// Permitir agregar cuentas con un metodo
	// guarda_cuentas.adiciona(cuenta);
	// obtener, asignar, remover, etc.
	
	Object[] referencia = new Object[10];

	int indice = 0;
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice ++;		
	}	
	
	public Object obtener(int indice) {
		return referencia[indice];		
	}

}
