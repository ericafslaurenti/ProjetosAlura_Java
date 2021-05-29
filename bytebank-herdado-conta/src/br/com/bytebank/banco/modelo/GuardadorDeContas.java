package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int  posicaoLivre;//vari�vel lembra a �ltima posi��o utilizada

    public GuardadorDeContas() {
    	this.referencias = new Conta[10];
    	this.posicaoLivre = 0;//inicializa a vari�vel
    }
    
    public void adiciona(Conta ref) {
    	this.referencias[this.posicaoLivre] = ref;
    	this.posicaoLivre++;//incrementa
    }

	public int getQuantidadeDeElementos() {
		 return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}


}
//a classe GuardadorDeContas esconde o acesso ao array, utilizando-o internamente, assim como as demais classes a utilizar�o.
//this.posicaoLivre = 0; A inicializa��o n � obrigat�ria, pois por padr�o, todos os atributos do tipo int s�o inicializados com o valor 0.