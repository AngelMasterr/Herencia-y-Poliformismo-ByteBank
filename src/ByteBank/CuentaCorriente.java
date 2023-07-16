package ByteBank;

public class CuentaCorriente extends Cuenta {

	// como la clase Padre tiene un constructor, obliga a que le demos los parametros que pide "int agencia, int numero"
	// por eso esta clase hija, debe tener tambien un constuctor con los parametros que exige el padre
	public CuentaCorriente(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
