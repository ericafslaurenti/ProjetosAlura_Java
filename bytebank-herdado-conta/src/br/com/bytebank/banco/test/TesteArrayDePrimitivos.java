package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array[]
	public static void main(String[] args) {
		
		int [] idades = new int [5];//j� inicializa o array c/ os valores padr�es =0
		
		for(int i = 0; i < idades.length; i++) {
				idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
	}
		
		
	}

}
//idades � minha refer�ncia 
//idades[0] = 29;//para acessar uma posi��o
//idades[1] = 39;
//idades[2] = 49;
//idades[3] = 59;
//idades[4] = 69;
//
//int idade4 = idades[4];
//
//System.out.println(idade4);
//
//System.out.println(idades.length);
