package Conta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Conta c =new Conta();
		
		criaConta(c);
		
		acessaConta(c);
		

	}
	private static void acessaConta(Conta c) {
		Scanner in = new Scanner(System.in);
		
		int op;
		do {
			
		op = operacao();
		
		switch(op) {
		
		case 1: System.out.println(" Saldo :"+c.saldo());
		break;
		
		case 2: System.out.println(" valor a ser Depositado :");
		double valor = Double.parseDouble(in.nextLine());
		c.deposita(valor);
		break;
		
		case 3: System.out.println(" valor a ser sacado :");
		if(c.saque(Double.parseDouble(in.nextLine()))) {
		System.out.println(" Saque realizado com Sucesso ");
		}else
			System.out.println(" erro de Saque");
		break;
		
		case 4: System.out.println(" Finalizar Sistema!");
		break;
		
		}
		}while(op != 4);
		System.out.println(" Sistema Finalizado!");
	}

	private static int operacao() {
		Scanner in = new Scanner(System.in);

		int op = 0;
		//do {
		System.out.println(" MENU "
				    +"\n 1 - mostrar o Saldo"
				    +"\n 2 - depositar valor"
				    +"\n 3 - sacar o dinheiro"
				    +"\n 4 - Finalizar Sistema");
		op = Integer.parseInt(in.nextLine());
		/*}while(op != 4);
		if(op <1 || op > 4);
		System.out.println(" opcao invalida!");*/
		
		return op;
		
	}
	private static void criaConta(Conta c) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Numero da Conta :");
		c.setNumero(Integer.parseInt(in.nextLine()));
		
		System.out.println("Nome do cliente : ");
		c.setCliente(in.nextLine());
		
		System.out.println("Tipo de Conta : ");
		c.setTipoConta(in.nextLine());
		
	  
		c.setSaldo(0);
		c.setStatus(true);
	}
	

}
