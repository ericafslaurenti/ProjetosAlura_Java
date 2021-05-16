
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
//super.saldo += valor (super eu vou subir a hierarquia, acessar o meu saldo. Saldo atual += valor)