package br.com.viniciusmendonca.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Vem de JFrame (JFrame.EXIT_ON_CLOSE)
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60)); //definir o tamanho que eu quero para o display
		add(display, BorderLayout.NORTH);//direcionando o display para o norte da tela 
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);//direcionando o teclado para o meio da tela
	}
	public static void main(String[] args) {
		//ele vai chamar o construtor, que vai começar a aplicação
		new Calculadora();
		
	}
}
