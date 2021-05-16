//quem assina esse contrato, precisa implementar (implements) os metodos
	//metod setSenha
	//metodo autentica

public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	//crio um construtror padr�o e dentro dele crio uma instancia do AutenticacaoUtil
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); //a chamada foi delegada, quem vai guardar a senha � o util
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}	
}
