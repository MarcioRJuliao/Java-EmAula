package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		if (idade >= 18) {
			System.out.println(nome + ", voc� � maior de idade ");
		} else
			System.out.println(idade + ", voc� � menor de idade");
	}
}
