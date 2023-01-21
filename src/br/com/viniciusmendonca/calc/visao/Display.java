package br.com.viniciusmendonca.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel{

	private final JLabel label;
	public Display() {
		setBackground(new Color(46, 49, 50));//definindo a cor no display
		label = new JLabel("1234,56");
		label.setForeground(Color.WHITE); //definindo a cor da minha label
		label.setFont(new Font("courier", Font.PLAIN, 30));//definindo a fonte
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 6, 18));//definindo o local do display
		
		add(label);
	}
}
