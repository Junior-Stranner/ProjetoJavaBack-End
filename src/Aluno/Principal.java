package Aluno;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		
		mostrarDados(a);
		
	}

	private static void mostrarDados(Aluno a) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Matricula :");
		a.setMatricula(Integer.parseInt(in.nextLine()));
		
		System.out.println(" Nome do Aluno:");
		a.setNomeAluno(in.nextLine());
		
		System.out.println(" curso:");
		a.setCurso(in.nextLine());
		
		System.out.println(" nota 1: ");
		a.setNota1(Double.parseDouble(in.nextLine()));
		
		System.out.println(" nota 2: ");
		a.setNota2(Double.parseDouble(in.nextLine()));
		
		System.out.println(" nota 3: ");
		a.setNota3(Double.parseDouble(in.nextLine()));
		
		int op;
		do {
	    
		System.out.println(" MENU "
		                + "\n 1 - Mostrar Media:"
		                + "\n 2 - Mostrar dados Cadastrados:"
		                + "\n 3 - Alterar dados:"
		                + "\n 4 - Finalizar sistema");
		op = Integer.parseInt(in.nextLine());
		
		switch(op){
		
		case 1:System.out.println(" media "+a.calcularMedia()); 
		break;
		
		case 2:System.out.println(a.mostrarDados()); 
		break;
		
		case 3: System.out.println(" Alterar Dados :"
				+ "\n 1 - Altera Curso :"
				+ "\n 2 - Altera Nota 1 :"
				+ "\n 3 - Altera Nota 2 :"
				+ "\n 4 - Altera Nota 3 :");
		int opcao = Integer.parseInt(in.nextLine());
		
		if(opcao == 1) {
			System.out.println(" Altera o Curso");
		String novoCurso = in.nextLine();
		a.setCurso(novoCurso);
		
		}else if(opcao == 2) {
			System.out.println(" Altera Nota1");
			double novaNota1 = Double.parseDouble(in.nextLine());
			if(confirma())
			a.setNota1(novaNota1);
			
		}else if(opcao == 3) {
			System.out.println(" Altera Nota2");
			double novaNota2 = Double.parseDouble(in.nextLine());
			if(confirma())
			a.setNota2(novaNota2);
			
		}else if(opcao ==4) {
			System.out.println(" Altera Nota3");
			double novaNota3 = Double.parseDouble(in.nextLine());
			if(confirma())
			a.setNota3(novaNota3);
			

		}
		break;
	}
		
		
		}while(op != 4);
		System.out.println("finalizar Sistema!");
	
		
		
		
	}
	
	public static boolean confirma() {
		int res;
	
		Scanner in = new Scanner(System.in);
		System.out.println(" confirmar dados alterado"
				+ "\n 1 - Sim"
				+ "\n 2 - Não");
		res = Integer.parseInt(in.nextLine());
		if(res == 1) {
		return true;
	  }else {
		  return false;
	  }

    }
}
