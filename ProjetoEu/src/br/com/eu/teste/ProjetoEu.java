package br.com.eu.teste;

import javax.swing.JOptionPane;

public class ProjetoEu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Queiros";
		int idade = 16;
		
		
		System.out.println("Meu nome � " + nome + " e minha idade � " + idade + " anos " );
		
		String nomeDois = "Gabriel Querois";
		
		String nomeTres = JOptionPane.showInputDialog("Digite seu Nome");
		System.out.println(nomeTres);

	}

}
