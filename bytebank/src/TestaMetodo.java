
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();//p/ invocar o metodo deposita, temos q referenciar uma conta contaDoPaulo
		contaDoPaulo.saldo = 100;//na invoca??o de um atributo, sempre usa o sinal de =
		contaDoPaulo.deposita(50);//p/ invocar o m?todo deposita() usamos o caracter . seguido de (), q contem o valor q queremos depositar
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20); //o valor ? guardado dentro da vari?vel boolean conseguiuRetirar, que guarda true ou false
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta(); //criei uma conta nova e fiz uma fechinha pra conta da Marcela
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("Transfer?ncia com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		//if(contaDaMarcela.transfere(3000, contaDoPaulo)) {//conta origem ? a da Marcela (esquerda) ? a refer?ncia this (no arquivo Conta.java), a conta destino ? a refer?ncia (contaDoPaulo)
			//System.out.println("Transfer?ncia com sucesso");
		//} else {
			//System.out.println("Saldo insuficiente");
		//} o c?digo comentado foi substitu?do pelo c?digo acima, o resultado ? o mesmo
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
