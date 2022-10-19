package FuncionarioPOO;

public class Funcionario{
	private int codigo;
	private String nome;
	private double salario;
	private int vendas;
	private int ferias;
	

	public void Funcionario(int codigo,String nome,double salario,int vendas,int ferias) {
		 this.codigo = codigo;
		 this.nome = nome;
		 this.salario = salario;
		 this.vendas = vendas;
		 this.ferias = ferias;
	}
	
	
	
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", ferias=" + ferias + "]";
	}
	public double calcularSalario(double comissao) {
		if(comissao >= 1000 && comissao < 5000) {
			return salario* 1.05;
		}else if(comissao >=5000 && comissao <10000) {
			return salario * 1.10;
		}else if (comissao >=10000 && comissao < 15000) {
		    return salario * 1.15;
		}
	    return 0.0;
		
	}
	
	public double calculaFerias(double dias ) {
		if(dias == 5) {
		return salario * 0.95;
		}else if(dias == 10) {
		return salario * 0.90;
		}else if(dias == 15) {
		return salario * 0.85;
		}
		return 0;
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getVendas() {
		return vendas;
	}
	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	public int getFerias() {
		return ferias;
	}
	public void setFerias(int ferias) {
		this.ferias = ferias;
	}

	

		
	

	
}