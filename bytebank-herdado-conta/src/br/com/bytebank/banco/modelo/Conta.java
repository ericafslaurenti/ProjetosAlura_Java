package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a abertura de uma conta
 *  
 * @author erica
 */

//private: a partir do momento que um atributo � privado, ele n pode ser lido, modificado por ningu�m a n ser a pr�pria classe
//protected: deixa p�blico apenas para os filhos

public abstract class Conta extends Object implements Comparable<Conta>,Serializable {
	
	protected double saldo; //� p�blico para os filhos
	private int agencia;
	private int numero;
	private transient Cliente titular; // o tipo titular deixa de ser uma String e passa a ser tipo cliente. o lado esq precisar ser o nome da vari�vel 
	private static int total = 0;
	
	//construtor padr�o
//		public Conta() {
//			
//		}

/**
 * Construtor par incializar o objeto Conta a partir da agencia e n�mero.
 * 
 * @param agencia
 * @param numero
 */
	//construtor espec�fico que foi criado
	public Conta(int agencia, int numero) {//p/ invoc�-lo obrigatoriamente tenho q informar a agencia e o n� da conta
		Conta.total++;
		//System.out.println("o total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta"  + this.numero);
	}
	
	public  abstract void deposita(double valor);
	
	/**
	 * Valor que precisa ser > do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor; //saldo ser� o saldo - o valor sacado
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
			destino.deposita(valor);
	}
	
	//cria um m�todo de devolve o saldo, j� que le est� private
	public double getSaldo( ) {//public q devolve um double, q pega um saldo e n recebe nada()
		return this.saldo;
	}
	//metodo para acessar a conta e devolver o n� dela
	public int getNumero() {
		return this.numero;
	}
	
	//metodo q altera o n� da conta
	public void setNumero(int numero) {//tem q passar o parametro entre os parenteses.M�todos q alteram o atributo normalmente s�o void, alteram e n devolvem nada.
		if(numero <= 0) {
			System.out.println("N�o pode valor <= 0");
			return;
		}
		this.numero = numero;//n� dessa conta recebe(=) o novo n� p/ essa conta(parametro)
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) { //se o valor ag <=0
			System.out.println("N�o pode valor menor igual a 0");
			return; //p�ra a execu��o
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}


}
//void deposita(double valor)=> no () add  q est� sendo recebido pelo m�todo, um parametro
//tem q especificar a variavel (valor) e o tipo (double)
//void Depois de depositar um valor na conta banc�ria, poderemos receber uma msg, n� ou comprovante. Nesse caso, como n�o existe qualquer tipo de retorno ao acionarmos um m�todo, utilizamos a palavra-chave void.
//void deposita � q ele recebe - (double valor)� o q ele devolve
//this.saldo = this.saldo + valor; � o mesmo que: this.saldo += valor; soma o valor a ele mesmo, assim como o -= tira o valor dele mesmo
//linha 105 - ref TesteArrayListEquals

//transient se vc grava uma conta, o cliente n sera gravado no objeto