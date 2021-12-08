package seguros;

import contas.Contas;

public class SeguroPessoaFisica extends Contas {

	public static void main(String[] args) {

		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.clientes = " claytony melo  ";
		cc3.saldo = 90000;
		System.out.println(" cliente: " + cc3.clientes);
		cc3.exibirSaldo();
		
	}

}
