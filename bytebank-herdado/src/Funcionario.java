//não pode mais instanciar objetos dessa classe pq é abstrata
//n existe algo concreto que é somente funcionário
public abstract class Funcionario {
	
	//atributos
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; //é public para os filhos, p/ outras classes não.
		
	//metodo sem corpo, n há implementação
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
