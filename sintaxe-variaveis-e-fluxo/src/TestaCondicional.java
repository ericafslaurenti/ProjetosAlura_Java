
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadeDePessoas = 3;
		
		if (idade >=18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if(quantidadeDePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
			
		}
	}

}
