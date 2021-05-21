package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
	super(agencia, numero);
}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
//minha classe conta especial está dentro de outro pacote, mas acesso o saldo devido extender a Conta (filho)
