package br.dev.gustavo.tabuada.model;
import br.dev.gustavo.tabuada.model.Tabuada;

import java.util.Scanner;

public class Menu {
	public void criarMenu() {
		Scanner leitor1 = new Scanner(System.in);
		Tabuada t1 = new Tabuada();
		
		System.out.print("ESCOLHER MINIMO MULTIPLICADOR:");
		double minMultiplicando = leitor1.nextDouble();	
		t1.setMinMultiplicador(minMultiplicando);

		System.out.print("ESCOLHER MAXIMO MULTIPLICADOR:");
		double maxMultiplicador = leitor1.nextDouble();	
		t1.setMaxMultiplicador(maxMultiplicador);

		System.out.print("ESCOLHER MULTIPLICANDO:");
		double multiplicando = leitor1.nextDouble();
		t1.setMultiplicando(multiplicando);
		
		t1.mostrarTabuada();
	}
}


