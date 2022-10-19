package Aluno;

public class Aluno{
	private int matricula;
	private String nomeAluno;
	private String curso;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public double calcularMedia() {
		return (this.nota1 + this.nota2 + this.nota3)/3;
	}
	
	public String mostrarDados() {
		return "Matricula "+this.matricula
		    +"\n Nome Aluno"+this.nomeAluno
		    +"\n Curso "+this.curso
		    +"\n nota1 "+this.nota1
		    +"\n nota2 "+this.nota2
		    +"\n nota3 "+this.nota3;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	

}