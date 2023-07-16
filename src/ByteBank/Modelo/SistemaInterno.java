package ByteBank.Modelo;

public class SistemaInterno {
	
	private String clave = "12345";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSecion = gerente.iniciarSecion(clave);
		if (puedeIniciarSecion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en Login");
			return false;
		}
		
	}

}
