package br.com.samsung.teste;

import javax.swing.JOptionPane;

import br.com.samsung.model.Celular;
import br.com.samsung.model.LinhaBranca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinhaBranca linhaBranca = new LinhaBranca();
		
		linhaBranca.setNome("Geladeira");
		linhaBranca.setPeso(230);
		linhaBranca.setTipo("Geladeira");
		
		//instanciar objeto celular
		
		Celular celularNovinho = new Celular();
		
		celularNovinho.setNome("Samsung 24");
		celularNovinho.setPeso(177);
		celularNovinho.setLarguraTela(7);
		celularNovinho.setAlturaTela(14.7);
		
		// teste
		double numero = Double.parseDouble("7");
		System.out.println(numero);
		
		// linhabranca2 
		
		LinhaBranca linhaBrancaDois = new LinhaBranca();
		
		linhaBrancaDois.setNome(JOptionPane.showInputDialog("Digite o nome"));
		linhaBrancaDois.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso")));
		linhaBrancaDois.setTipo(JOptionPane.showInputDialog("Digite o tipo"));
		
		//celular novinho dois
		
		Celular celularNovinhoDois = new Celular();
		
		celularNovinhoDois.setNome(JOptionPane.showInputDialog("Digite o nome"));
		celularNovinhoDois.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso")));
		celularNovinhoDois.setLarguraTela(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura")));
		celularNovinhoDois.setAlturaTela(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
		
		
		
		
	}

}
