//Gerente ? um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel (implements Autenticavel), ? um Autenticavel
	//quem assina o contrato precisa implementar
		//metod setSenha
		//metodo autentica

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//metodo que cria a bonifica??o dos funcion?rios
	public double getBonificacao() {
		System.out.println("Chamando o m?todo de bonificacao do GERENTE");
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);	
	}
}
//super: palavra chave q busca o atributo na super class. Significa q esse atributo n est? definido nessa classe