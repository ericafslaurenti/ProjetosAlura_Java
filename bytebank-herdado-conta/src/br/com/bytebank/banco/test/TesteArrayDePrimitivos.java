package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array[]
	public static void main(String[] args) {
		
		int [] idades = new int [5];//já inicializa o array c/ os valores padrões =0
		
		for(int i = 0; i < idades.length; i++) {
				idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
	}
		
		
	}

}
//idades é minha referência 
//idades[0] = 29;//para acessar uma posição
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
