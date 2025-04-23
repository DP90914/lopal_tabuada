package br.dev.gustavo.tabuada.model;


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

	public double getMaxMultiplicador() {
		return maxMultiplicador;
	}

	public String[] mostrarTabuada() {
		double tamanho = maxMultiplicador - minMultiplicador + 1;
		String[] tabuada = new String[(int) tamanho];
		
		int indice = 0;
		while (minMultiplicador <= maxMultiplicador) {
			double produto = multiplicando * minMultiplicador;
			tabuada[indice] = multiplicando + " X " + minMultiplicador + " = " + produto;
			minMultiplicador++;
			indice++;

		}
		return tabuada;
	}
}
