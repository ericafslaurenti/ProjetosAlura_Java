
public class ControleBonificacao {
	//atributo para guardar a bonificacao
	private double soma;
	
	public void registra(Funcionario f) {// esse "f" pode apontar p/ qualquer funcionario
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
			
	public double getSoma() {
		return soma;
	}

}
