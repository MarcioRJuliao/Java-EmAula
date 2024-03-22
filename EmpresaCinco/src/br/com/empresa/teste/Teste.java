package br.com.empresa.teste;

import javax.swing.JOptionPane;

import br.com.empresa.beans.Funcionario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Nome do funcionário: "));
		funcionario.setSexo(JOptionPane.showInputDialog("Sexo do funcionário: "));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do funcionário: ")));
		funcionario.setCargo(JOptionPane.showInputDialog("Cargo do funcionário: "));
		
		funcionario.mostrarAtributo();
	}
}
