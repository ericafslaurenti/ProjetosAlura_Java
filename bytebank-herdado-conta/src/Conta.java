//private: a partir do momento que um atributo é privado, ele n pode ser lido, modificado por ninguém a n ser a própria classe
//protected: deixa público apenas para os filhos

public abstract class Conta {
	protected double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular; // o tipo titular deixa de ser uma String e passa a ser tipo cliente. o lado esq precisar ser o nome da variável 
	private static int total = 0;
	
	//construtor padrão
//		public Conta() {
//			
//		}
		
	//construtor específico que foi criado
	public Conta(int agencia, int numero) {//p/ invocá-lo obrigatoriamente tenho q informar a agencia e o nº da conta
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta"  + this.numero);
	}
	
	public  abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor){ //se o saldo dessa conta for >= ao valor, eu retiro
			this.saldo -= valor; //saldo será o saldo - o valor sacado
			return true; //retorn palavra chave do Java q para a execução daquele método e volta p/ quem estava chamando e retorna o valor
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	//cria um método de devolve o saldo, já que le está private
	public double getSaldo( ) {//public q devolve um double, q pega um saldo e n recebe nada()
		return this.saldo;
	}
	//metodo para acessar a conta e devolver o nº dela
	public int getNumero() {
		return this.numero;
	}
	
	//metodo q altera o nº da conta
	public void setNumero(int numero) {//tem q passar o parametro entre os parenteses.Métodos q alteram o atributo normalmente são void, alteram e n devolvem nada.
		if(numero <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = numero;//nº dessa conta recebe(=) o novo nº p/ essa conta(parametro)
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) { //se o valor ag <=0
			System.out.println("Não pode valor menor igual a 0");
			return; //pára a execução
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

}
//void deposita(double valor)=> no () add  q está sendo recebido pelo método, um parametro
//tem q especificar a variavel (valor) e o tipo (double)
//void Depois de depositar um valor na conta bancária, poderemos receber uma msg, nº ou comprovante. Nesse caso, como não existe qualquer tipo de retorno ao acionarmos um método, utilizamos a palavra-chave void.
//void deposita é q ele recebe - (double valor)é o q ele devolve
//this.saldo = this.saldo + valor; é o mesmo que: this.saldo += valor; soma o valor a ele mesmo, assim como o -= tira o valor dele mesmo