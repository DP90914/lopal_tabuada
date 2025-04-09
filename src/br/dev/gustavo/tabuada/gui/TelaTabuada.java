package br.dev.gustavo.tabuada.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class TelaTabuada {
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicando;
	private JLabel labelMaxMultiplicando;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicando;
	private JTextField textMaxMultiplicando;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane ScrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada() {
		
	}
	private void limparTabuada() {
		
	}
	public void criarTelaTabuada() {
		JFrame tela = new JFrame() ;
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("MULTIPLICANDO: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		labelMinMultiplicando = new JLabel();
		labelMinMultiplicando.setText("MIN.MULTIPLICANDO: ");
		labelMinMultiplicando.setBounds(20, 55, 150, 30);

		labelMaxMultiplicando = new JLabel();
		labelMaxMultiplicando.setText("MAX.MULTIPLICANDO: ");
		labelMaxMultiplicando.setBounds(20, 90, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setText("");
		textMultiplicando.setBounds(300, 20, 75, 30);
		
		textMinMultiplicando = new JTextField();
		textMinMultiplicando.setText("");
		textMinMultiplicando.setBounds(300, 55, 75, 30);
		
		textMaxMultiplicando = new JTextField();
		textMaxMultiplicando.setText("");
		textMaxMultiplicando.setBounds(300, 90, 75, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 150, 150, 50);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 150, 150, 50);
		
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinMultiplicando);
		tela.getContentPane().add(labelMaxMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinMultiplicando);
		tela.getContentPane().add(textMaxMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		
		
		//ultima coisa
		tela.setVisible(true);
		
	}
	
}
