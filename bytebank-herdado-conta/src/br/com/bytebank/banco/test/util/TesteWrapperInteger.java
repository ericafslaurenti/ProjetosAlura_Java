package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int idade = 29;//Integer classe que representa um primitivo		
//		Integer idadeRef = new Integer(29); ao invés de dar new no objeto, delega a criação p/ um metodo (linha abaixo)
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue();//unboxing
		String s = args[0];//"10"
//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//Autoboxing
		
	}

}

//array primtivo: int[] idades = new int[5];(cd casa guarda um valor primitivo)
//array de referencia: String[] nomes = new String[5]; (cd casa guardar referencia pra encontrar o objeto)
//no mundo de listas, só existe listas de referencias
//Integer: o Java cria um objeto e internamente guarda um primitivo, integer trasnforma seu primitivo em objeto e guarda dentro do array uma referencia
//Autoboxing: transformação automatica do primitivo p/ objeto e vice-versa
//new Integer(29);//mostra integer riscado pq n deveria +usar esse construtor (decrepted)
//linha 17: a partir da referencia posso criar métodos