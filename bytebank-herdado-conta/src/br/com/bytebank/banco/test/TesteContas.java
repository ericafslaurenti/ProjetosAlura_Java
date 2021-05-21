package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;//import sem * é um import específico e deixa claro q eu quero usar apenas essa classe
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.test.TesteContas(seleciona TesteContas, botao dir, Copy Qualified Name
public class TesteContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{

		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
//import br.com.bytebank.banco.modelo.*; =>importa da classe modelo pq os testes usam as classes do modelo
