package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class ProjetoCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));	
		
		System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos ");

	}

}
