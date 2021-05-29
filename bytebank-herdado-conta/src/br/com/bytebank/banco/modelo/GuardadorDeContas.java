package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int  posicaoLivre;//variável lembra a última posição utilizada

    public GuardadorDeContas() {
    	this.referencias = new Conta[10];
    	this.posicaoLivre = 0;//inicializa a variável
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
//a classe GuardadorDeContas esconde o acesso ao array, utilizando-o internamente, assim como as demais classes a utilizarão.
//this.posicaoLivre = 0; A inicialização n é obrigatória, pois por padrão, todos os atributos do tipo int são inicializados com o valor 0.