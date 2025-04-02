package br.dev.gustavo.tabuada.model;

import java.util.Scanner;

public class Menu {
	public void criarMenu() {
		Scanner leitor1 = new Scanner(System.in);
		
		System.out.println("ESCOLHER MINIMO MULTIPLICADOR:");
		double minMult = leitor1.nextInt();

		System.out.println("ESCOLHER MAXIMO MULTIPLICADOR:");
		double maxMult = leitor1.nextInt();
		
		System.out.println("ESCOLHER MULTIPLICANDO:");
		double Mult = leitor1.nextInt();
}
}
