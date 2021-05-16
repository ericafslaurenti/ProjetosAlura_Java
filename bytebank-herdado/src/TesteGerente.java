
public class TesteGerente {

	public static void main(String[] args) {
		
		//aqui foi criado algo muito generico, de maneira que podemos usar a referencia do tipo autenticavel para um cliente, Administrador
		Autenticavel referencia = new Cliente();//autenticavel que essa referencia aponta p/ o objeto Gerente
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("2355648413");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
