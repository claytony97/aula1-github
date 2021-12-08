package contas;

public class Contas {
//atributos

	protected String clientes;
	protected  double saldo;

	// construtor

	public Contas() {
		System.out.println(" Agencia 0261 ");
	}
// metodos

	protected void exibirSaldo() {
		System.out.println(" Saldo: R$ " + saldo);
	}
	
	void sacar (double valor) {
		saldo-= valor;
		System.out.println(" Debito: R$ " + valor );
	}
	void deposito (double valor) {
		saldo += valor;
		System.out.println(" Credito: R$ " + valor );
	}
}
