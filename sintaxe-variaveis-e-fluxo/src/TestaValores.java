 
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro; // a variável guarda um valor, e não uma referência
		primeiro = 10;
		
		
		//quanto vale o segundo?
		
		System.out.println(segundo);
	}

}
