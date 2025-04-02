package br.dev.gustavo.tabuada.model;
import br.dev.gustavo.tabuada.model.Menu;

public class Tabuada {
	private double multiplicando;
	private double minMultiplicador;
	private double maxMultiplicador;
	

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMinMultiplicador(double minMultiplicador) {
		this.minMultiplicador = minMultiplicador;
	}

	public double getMinMultiplicador() {
		return minMultiplicador;
	}

	public void setMaxMultiplicador(double maxMultiplicador) {
		this.maxMultiplicador = maxMultiplicador;
	}

	public double MaxMultiplicador() {
		return maxMultiplicador;
	}

	public void mostrarTabuada() {
		
		while (minMultiplicador <= maxMultiplicador + 1 ) {
			double produto = multiplicando * minMultiplicador;
			System.out.println(multiplicando + " X " + minMultiplicador + " = " + produto);
			minMultiplicador = minMultiplicador + 1;

		}
	}
}
