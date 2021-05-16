 
public class TestaCaracteres {
	
	public static void main(String[] args){
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		// apresenta resultado B, isso ocorre pois na tabela Unicode o 65 corresponde à letra a, logo, 66 a letra B
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		//há um erro de compilação em valor + 1, por conta da regra do Java quando se trabalha com dois tipos distintos em uma mesma operação, de dar o resultado no maior deles. Neste caso, o valor é do tipo char, e 1 é um int, que é maior. O resultado desta operação, portanto, será dado em int
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		//o funcionamento básico de uma String exige aspas duplas
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
	}

}
