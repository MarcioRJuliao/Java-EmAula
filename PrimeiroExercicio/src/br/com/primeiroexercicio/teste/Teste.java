package br.com.primeiroexercicio.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.Mamifero;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		
		mamifero.setEspecie(JOptionPane.showInputDialog("Digite a esp�cie: "));
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal: ")));
		mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite os meses de gesta��o: ")));
		
		
		System.out.println("A esp�cie � " + mamifero.getEspecie() +
				"\nO nome do animal � " + mamifero.getNome() +
				"\nA idade do animal � " + mamifero.getIdade() +
				"\nMeses de gesta��o do animal " + mamifero.getMesesGestacao());
	}

}
