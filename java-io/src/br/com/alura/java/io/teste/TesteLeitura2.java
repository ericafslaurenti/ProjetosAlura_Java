package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			//scanner analisa a linha (source) baseado no caracter de separação(,)
			Scanner linhaScanner = new Scanner(linha);//Scanner baseado na linha
			linhaScanner.useLocale(Locale.US);//sempre usa as regras americanas
			linhaScanner.useDelimiter(",");//define caracter de separação
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d %20s: %08.2f %n", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		scanner.close();
	}

}

//scanner serve para ler linha por linha
