
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();//preciso declarar de qual vari�vel �, conta ref a 1� conta
		primeiraConta.saldo = 200; //.saldo vai buscar dentro do objeto o atributo de nome saldo
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(); //new Conta() � um endere�o de mem�ria q ele guardou e eu quero guardar isso dentro de uma refer�ncia q se chama 2� conta
		segundaConta.saldo = 300;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta" + " na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) { //== vai comparar referencia e n o objeto
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
	

}
