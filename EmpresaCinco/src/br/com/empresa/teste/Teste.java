package br.com.empresa.teste;

import javax.swing.JOptionPane;

import br.com.empresa.beans.Funcionario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Nome do funcion�rio: "));
		funcionario.setSexo(JOptionPane.showInputDialog("Sexo do funcion�rio: "));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do funcion�rio: ")));
		funcionario.setCargo(JOptionPane.showInputDialog("Cargo do funcion�rio: "));
		
		funcionario.mostrarAtributo();
	}
}
