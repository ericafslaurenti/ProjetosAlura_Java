
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 0; //contador inicia no 0
		int total = 0;
		
		while(contador <=10) {//contador vai até 10
			//total = total + contador; é a mesma coisa que total += contador;
			total += contador;//pega a somatória e guarda, daí soma 1, depois 2, depois 3 nele mesmo e assim por diante --- += vale ele mesmo + contador
			contador++;
		}
		System.out.println(total); //se eu colocar essa fç dentro do parenteses do while, ele vai guardar e somar +1
	}

}
