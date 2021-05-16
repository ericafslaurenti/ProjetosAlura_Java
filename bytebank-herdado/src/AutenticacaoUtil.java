//AutenticacaoUtil criado para resolver o problema de repetição de código nas classes Cliente, Gerente, Admin
//a lógica de autenticacao fica num só lugar

public class AutenticacaoUtil {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}		
	}
}
