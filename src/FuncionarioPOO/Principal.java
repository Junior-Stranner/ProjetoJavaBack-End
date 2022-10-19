package FuncionarioPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Funcionario> list = new ArrayList<>();
		Funcionario func = new Funcionario();

		int op = 0;
		do {
	   System.out.println(" MENU "
			          +"\n 1 - cadstrar Funcionario "
			          +"\n 2 - mostrar Dados "
			          +"\n 3 - pesquisar Funcionario "
			          +"\n 4 - Finalizar Sistema ");
	   op =Integer.parseInt(in.nextLine());

		switch(op) {

		case 1: cadstrarFuncionario(list,func);break;
		case 2: mostrarDados(list);break;
		case 3: pesquisarFuncionario(list );break;

		}
		}while(op != 4);
	}


	private static void pesquisarFuncionario(ArrayList<Funcionario> list) {
		Scanner in = new Scanner(System.in);
		

		System.out.println(" nome do funcionario ");
		String nome = in.nextLine();

		for (Funcionario func : list) {
			if(func.getNome().equalsIgnoreCase(nome)) {
				System.out.println(" código "+func.getCodigo()
				               +"\n  nome "+func.getNome()
				               +"\n salario "+func.getSalario()
				               +"\n  vendas "+func.getVendas()
				               +"\n ferias "+func.getVendas());

			}

		}

	}


	private static void mostrarDados(ArrayList<Funcionario> list ) {
		System.out.println("------------------");
		for (Funcionario func : list) {
			System.out.println(" código :"+func.getCodigo()
			+"\n nome :"+func.getNome()
			+"\n salario :"+func.getSalario()
			+"\n valor + comissao :"+func.calcularSalario(func.getVendas())
			+"\n ferias :"+func.getFerias()
			+"\n valor - dias Ferias :"+func.calculaFerias(func.getFerias()));
			System.out.println("--------------------");

		}

	}

	private static void cadstrarFuncionario(ArrayList<Funcionario>list,Funcionario func) {
		Scanner in = new Scanner(System.in);

		System.out.println("código :");
		func.setCodigo(Integer.parseInt(in.nextLine()));
		System.out.println("nome  :");
		func.setNome(in.nextLine());
		System.out.println(" salario :");
		func.setSalario(Double.parseDouble(in.nextLine()));
		System.out.println("vendas :");
		func.setVendas(Integer.parseInt(in.nextLine()));
		System.out.println("ferias : ");
		func.setFerias(Integer.parseInt(in.nextLine()));

		list.add(func);


	}

}
