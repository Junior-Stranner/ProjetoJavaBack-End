package Conta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		criaConta(c);
		
		assecaConta(c);
		

	}

	private static void criaConta(Conta c) {
		Scanner in = new Scanner(System.in);
		
		c.setSaldo(0);
		c.setStatus(true);
		
		System.out.println(" Numero da Conta ");
		c.setNumero(Integer.parseInt(in.nextLine()));
		System.out.println(" Nome do Cliente ");
		c.setCliente(in.nextLine());
		System.out.println(" Tipo de Conta ");
		c.setTipoCionta(in.nextLine());
		

	}

	private static void assecaConta(Conta c) {
		Scanner in = new Scanner(System.in);
		 int op = 0;
		 do {
	   op = operacao();
	   
		switch(op){
		
		case 1: System.out.println(" Saldo :"+c.saldo());	
		break;
		
		case 2: System.out.println("Valor a ser depositado ");
		double valor = Double.parseDouble(in.nextLine());
		c.deposita(valor);
		break;
		
		case 3:System.out.println(" valor a ser sacado ");
		valor = Double.parseDouble(in.nextLine());
		if(c.saque(valor) == true) {
			System.out.println("Saque realizado com susseco! ");
		}else
			System.out.println(" erro de saque! ");
		break;
		
		
		case 4:System.out.println(" Finaliza Sistema"); 
		break;
		
		}
		}while(op != 4);
	 
	   
 }

	private static int operacao() {
		Scanner in = new Scanner(System.in);
		int op =0 ;
		do {
		 
		System.out.println(" Menu "
		                + "\n 1 - Saldo"
		                + "\n 2 - Depositar"
		                + "\n 3 - Sacar"
		                + "\n 4 finalizar Sistema");
		op = Integer.parseInt(in.nextLine());
		
		
		
	}while(op <1 || op >4);
		if(op <1 || op >4) {
		System.out.println("opçao invalida");
		}
		return op;
		
  }
}
