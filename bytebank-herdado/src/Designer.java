//Gerente é um Funcionario ou Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método do Designer");
		return 200; 
	}
	
}

		
	