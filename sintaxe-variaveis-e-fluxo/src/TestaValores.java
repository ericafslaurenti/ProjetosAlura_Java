 
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro; // a vari�vel guarda um valor, e n�o uma refer�ncia
		primeiro = 10;
		
		
		//quanto vale o segundo?
		
		System.out.println(segundo);
	}

}
