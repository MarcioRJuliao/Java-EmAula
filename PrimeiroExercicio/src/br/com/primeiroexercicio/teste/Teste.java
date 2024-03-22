package br.com.primeiroexercicio.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.Mamifero;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		
		mamifero.setEspecie(JOptionPane.showInputDialog("Digite a espécie: "));
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal: ")));
		mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite os meses de gestação: ")));
		
		
		System.out.println("A espécie é " + mamifero.getEspecie() +
				"\nO nome do animal é " + mamifero.getNome() +
				"\nA idade do animal é " + mamifero.getIdade() +
				"\nMeses de gestação do animal " + mamifero.getMesesGestacao());
	}

}
