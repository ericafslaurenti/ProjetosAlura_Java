//n�o pode mais instanciar objetos dessa classe pq � abstrata
//n existe algo concreto que � somente funcion�rio
public abstract class Funcionario {
	
	//atributos
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; //� public para os filhos, p/ outras classes n�o.
		
	//metodo sem corpo, n h� implementa��o
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
