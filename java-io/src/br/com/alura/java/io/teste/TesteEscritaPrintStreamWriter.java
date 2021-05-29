package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaPrintStreamWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));//consegue imprimir através de um fluxo binário
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();
	}

}
//InputStreamReader: classe capaz de transformar um int em caracteres
//buffered: continua com a leitura, mas guarda os caracteres
// \r\n caracter especial q  indica a criação de uma nova linha (Windows)
// \n caracter especial q  indica a criação de uma nova linha (Unix)
//System.lineSeparator() indica a criação de uma nova linha (qlq SO)
//println - imprime e já cria uma nova linha