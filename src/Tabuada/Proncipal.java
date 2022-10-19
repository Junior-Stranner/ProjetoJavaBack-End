package Tabuada;

import java.util.Scanner;

public class Proncipal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Tabuada t = new Tabuada();
		
		System.out.println("digite um numero");
		t.setX(Integer.parseInt(in.nextLine()));
		System.out.println(" digite um d=segundo numero ");	
		t.setY(Integer.parseInt(in.nextLine()));

	}

}
