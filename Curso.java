package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Curso {

	private String nome;
	private String Instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private	Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		Instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return Instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);

	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
        + ", aulas: + " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
//LinkedList ela implementa lista, n é filha de List
//unmodifiableList é somente leitura
//LinkedList e ArrayList são 2 implementações de lista que respeitam a mesma regra...
//...a diferença entre ela é a performance (p/ listas grandes opte por Array, para menores, LinkedList
//TreeSet só funciona para classes que são comparable