
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //temos 2 refer?ncias para o mesmo objeto e eu s? tenho 1 new Conta()
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {//== vai comparar referencia e n o objeto
			System.out.println("s?o a mesm?ssima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta); //dentro do objeto, os 2 tem o mesmo n?, por isso repete o n? da conta
	}
	

}
