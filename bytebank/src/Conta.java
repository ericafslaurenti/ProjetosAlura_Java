public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public  void deposita(double valor) {//nome deposita vc q define
		this.saldo += valor; //saldo ? um atributo do objeto e valor uma vari?vel - this ? a conta q estou invocando
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor){ //se o saldo dessa conta for >= ao valor, eu retiro
			this.saldo -= valor; //saldo ser? o saldo - o valor sacado
			return true; //retorn palavra chave do Java q para a execu??o daquele m?todo e volta p/ quem estava chamando e retorna o valor
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) { //se o meu saldo for >= valor
			this.saldo -= valor; //tiro a quant de dinheiro
			destino.deposita(valor);//deposita na conta destino
			return true; //transferencia com sucesso
		} //else {//caso n tenha $ suficiente - usar o else ? opcional nesse caso
			return false; //retorna false
		//}
	}

}
//void deposita(double valor)=> no () add  q est? sendo recebido pelo m?todo, um parametro
//tem q especificar a variavel (valor) e o tipo (double)
//void Depois de depositar um valor na conta banc?ria, poderemos receber uma msg, n? ou comprovante. Nesse caso, como n?o existe qualquer tipo de retorno ao acionarmos um m?todo, utilizamos a palavra-chave void.
//void deposita ? q ele recebe - (double valor)? o q ele devolve
//this.saldo = this.saldo + valor; ? o mesmo que: this.saldo += valor; soma o valor a ele mesmo, assim como o -= tira o valor dele mesmo