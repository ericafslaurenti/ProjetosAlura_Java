//AutenticacaoUtil criado para resolver o problema de repeti��o de c�digo nas classes Cliente, Gerente, Admin
//a l�gica de autenticacao fica num s� lugar

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
