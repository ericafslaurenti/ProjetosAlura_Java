
public class TestaLacos {

	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) { // imprime de 0 a 10, 10 vezes e na prox linha quero fazer a mesma coisa, só q *2, 3... a tabuada
			for(int contador = 0; contador <=10; contador++) { //esse será o outro valor q eu quero *, o contador mesmo
				System.out.print(multiplicador * contador);//sem o ln no final
				System.out.print(" ");//sem o ln - aqui vou dar um espaço no final de cada tabuada
			}
			System.out.println();//aqui vou pular a linha ao final de cada tabuada
		}
			
	
}
}
