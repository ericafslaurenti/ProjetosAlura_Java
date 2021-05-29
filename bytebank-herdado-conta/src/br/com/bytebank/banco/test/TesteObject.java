package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente(); 
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);
}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {}
}
//dentro da classe que representa o out, tem no mínimo as 3 versões acima...
///... tem vários métodos com o mesmo nome, mesma assinatura e só variando nos parâmetros (sobrecarga)

