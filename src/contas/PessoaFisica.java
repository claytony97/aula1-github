package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		
		Contas cc1 = new Contas();
		cc1.clientes = " Leandro Ramos ";
		cc1.saldo = 10000;
		System.out.println(" cliente: " + cc1.clientes);
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println("------------------------------------------");
		
		
		Contas cc2 = new Contas();
		cc2.clientes = " Leandro Ramos ";
		cc2.saldo = 1000;
		System.out.println(" cliente: " + cc2.clientes);
		cc2.exibirSaldo();	
		cc2.deposito(5000);	
		cc2.exibirSaldo();
	}

}
