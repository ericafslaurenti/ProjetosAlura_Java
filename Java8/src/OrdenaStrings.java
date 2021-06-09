import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); - substituído pela linha 28
		
		//uso da factoring dentro da interface comparator q recebe uma function
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));//escrevendo comparing com metodo reference
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		// o java vai saber que o forEach recebe consume, ele vai tentar compilar o
		// valor do "s" pra dentro do consumer
		//Muda o forEach pra usar method reference no lugar do lambda
		palavras.forEach(System.out::println);
	}
}

class ComparadorPorTamanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
//default methods permite que as interfaces declarem novos métodos de maneira compatível com classes que já exisitiam
//lambda funciona sempre numa interface em q vc tem 1 método abstrato (interface funcional)
//a expressão lambda consegue ser convertida para uma interface funcional
//metodo default tmb pode ser estático
//(String::length)); - metodo reference avaliado como lambda
