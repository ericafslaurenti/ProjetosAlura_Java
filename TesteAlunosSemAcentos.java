package br.com.alura;

	import java.util.*;

	public class TesteAlunosSemAcentos {

	    public static void main(String[] args) {

	        Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    

	        System.out.println(alunos.size());

	        alunos.add("Paulo");

	        System.out.println(alunos.size());
	        
	        boolean adicionou = alunos.add("Paulo");
	        System.out.println("Paulo foi adicionado ao Set? " + adicionou);
	    }
	    
}
