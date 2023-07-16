package ByteBank;

// interface: todos los atributos son abstractos, no hay manera de acceder a ellos desde otro archivo
// tampoco puede extenderse a otra clase que no sea interface

public interface Autenticable  {
		
	public void setClave(String clave);
	
	public boolean iniciarSecion(String clave);
	
}
