//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
	//metod setSenha
	//metodo autentica

//nessa classe foi eliminado tudo o que era concreto, deixamos apenas as assinaturas dos metodos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha); 

}
//classes abstratas n�o s�o obrigadas a implementar