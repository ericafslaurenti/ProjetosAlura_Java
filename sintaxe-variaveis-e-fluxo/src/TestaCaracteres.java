 
public class TestaCaracteres {
	
	public static void main(String[] args){
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		// apresenta resultado B, isso ocorre pois na tabela Unicode o 65 corresponde � letra a, logo, 66 a letra B
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		//h� um erro de compila��o em valor + 1, por conta da regra do Java quando se trabalha com dois tipos distintos em uma mesma opera��o, de dar o resultado no maior deles. Neste caso, o valor � do tipo char, e 1 � um int, que � maior. O resultado desta opera��o, portanto, ser� dado em int
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		//o funcionamento b�sico de uma String exige aspas duplas
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
	}

}
