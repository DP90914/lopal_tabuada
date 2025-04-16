package br.dev.gustavo.tabuada.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.gustavo.tabuada.model.Tabuada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada() {
		
	}
	private void limparTabuada() {
		
	}
	public void criarTelaTabuada() {
		JFrame tela = new JFrame() ;
		tela.setTitle("Tabuada");
		tela.setSize(300, 680);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
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
		textMultiplicando.setBounds(200, 20, 75, 30);
		
		textMinMultiplicando = new JTextField();
		textMinMultiplicando.setText("");
		textMinMultiplicando.setBounds(200, 55, 75, 30);
		
		textMaxMultiplicando = new JTextField();
		textMaxMultiplicando.setText("");
		textMaxMultiplicando.setBounds(200, 90, 75, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 150, 120, 50);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(155, 150, 120, 50);

		listTabuada = new JList();
		
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 220, 255, 410);
		

		
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinMultiplicando);
		tela.getContentPane().add(labelMaxMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinMultiplicando);
		tela.getContentPane().add(textMaxMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Tabuada tabuada = new Tabuada();
				
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);

				String minMultiplicando = textMinMultiplicando.getText();
				double minMultiplicandoDouble = Double.valueOf(minMultiplicando);
				tabuada.setMinMultiplicador(minMultiplicandoDouble);
				
				String maxMultiplicando = textMaxMultiplicando.getText();
				double maxMultiplicandoDouble = Double.valueOf(maxMultiplicando);
				tabuada.setMaxMultiplicador(maxMultiplicandoDouble);
				
				tabuada.mostrarTabuada();
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textMultiplicando.setText("");
				textMinMultiplicando.setText("");
				textMaxMultiplicando.setText("");
				textMultiplicando.requestFocus();
			}
		});
		
		
		//ultima coisa
		tela.setVisible(true);
		
	}
	
}
