//aqui vou criar a referencia para o cliente Paulo
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		//crio a referencia conta
		Conta contaDoPaulo = new Conta();//criou o objeto, devolveu o n� e guardou dentro da refer�ncia
		contaDoPaulo.deposita(100);
		
		//associa o cliente paulo a conta contaDoPaulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}

}
