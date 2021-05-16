
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <=10) {
			System.out.println(contador);
			//contador = contador +1; é a mesma coisa que contador += 1;
			//contador += 1; é a mesma coisa que contador ++;
			contador ++; //vale ele +1
		}
		System.out.println(contador);
	}

}
