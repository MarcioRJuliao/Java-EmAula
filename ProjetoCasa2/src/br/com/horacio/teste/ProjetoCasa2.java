package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class ProjetoCasa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		if (idade  >= 18) {
			System.out.println("Você é maior de idade ");
		}
		else 
			System.out.println("Você é menor de idade");

	}

}
