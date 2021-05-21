package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {//agora a conta corrente tem um construtor especifico
		super(agencia, numero);//vou repassar ag e nº na chamada do construtor especifico
	}
	
	//metodo que eu redefinir/reescrever
	@Override//usando o @Overrride o compilador sabe q estou com a inteção de sobreescrever
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
//public ContaCorrente() {} só compila se criarmos um construtor padrão na class Conta, pois ela tinha apenas um construtor específico
//super();//aqui eu chamdo o construtor e o Java automaticamente chama o construtor da classe mãe
//posso usar o super pra dizer ao Java q não tem um construtor padrão, mas que eu quero chamar um construtor especifíco
//se estou estendendo uma classe que é abstrata, o filho é obrigado a implementar o método.