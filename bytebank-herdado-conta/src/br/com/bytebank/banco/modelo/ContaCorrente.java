package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {//agora a conta corrente tem um construtor especifico
		super(agencia, numero);//vou repassar ag e n� na chamada do construtor especifico
	}
	
	//metodo que eu redefinir/reescrever
	@Override//usando o @Overrride o compilador sabe q estou com a inte��o de sobreescrever
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}


//estendendo a conta vc herda os atributos e os objetos, mas n herda os construtores
//public ContaCorrente() {} s� compila se criarmos um construtor padr�o na class Conta, pois ela tinha apenas um construtor espec�fico
//super();//aqui eu chamdo o construtor e o Java automaticamente chama o construtor da classe m�e
//posso usar o super pra dizer ao Java q n�o tem um construtor padr�o, mas que eu quero chamar um construtor especif�co
//se estou estendendo uma classe que � abstrata, o filho � obrigado a implementar o m�todo.