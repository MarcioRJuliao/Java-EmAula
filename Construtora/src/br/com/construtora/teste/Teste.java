package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;
import br.com.construtora.model.Casa;
import br.com.construtora.model.Imovel;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apartamento apartamentoNovinho = new Apartamento();
		
		apartamentoNovinho.setNome("Prédio das Oliveiras");
		apartamentoNovinho.setMetrosQuadrados(800);
		apartamentoNovinho.setQuantidadeQuartos(2);
		apartamentoNovinho.setQuantidadeVarandas(3);
		
		System.out.println("Nome " + apartamentoNovinho.getNome() +
				"\nMetros quadrados " + apartamentoNovinho.getMetrosQuadrados() +
				"\nQuantidade de quartos " + apartamentoNovinho.getQuantidadeQuartos() +
				"\nQuantidade varandas" + apartamentoNovinho.getQuantidadeVarandas());
		
		Apartamento apartamentoNovinhoDois = new Apartamento();
		
		apartamentoNovinhoDois.setNome
		(JOptionPane.showInputDialog("Digite o nome"));
		apartamentoNovinhoDois.setMetrosQuadrados
		(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de metros quadrados")));
		apartamentoNovinhoDois.setQuantidadeQuartos
		(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quartos")));
		apartamentoNovinhoDois.setQuantidadeVarandas
		(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de varandas")));
		
		
		Casa casaNovinha = new Casa();
		
		casaNovinha.setNome("Oliveira");
		casaNovinha.setMetrosQuadrados(1000);
		casaNovinha.setQuantidadeQuartos(4);
		casaNovinha.setMetrosQuadradosGaragem(20);
		
		System.out.println("Nome " + casaNovinha.getNome() +
				"\nMetros quadrados " + casaNovinha.getMetrosQuadrados() +
				"\nQuantidade de quartos " + casaNovinha.getQuantidadeQuartos() +
				"\nQuantidade de metros quadrados garagem " + casaNovinha.getMetrosQuadradosGaragem());
		
		Casa casaNovinhaDois = new Casa();
		
		casaNovinhaDois.setNome
		(JOptionPane.showInputDialog("Digite o nome"));
		casaNovinhaDois.setMetrosQuadrados
		(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de metros quadrados")));
		casaNovinhaDois.setQuantidadeQuartos
		(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quartos")));
		casaNovinhaDois.setMetrosQuadradosGaragem
		(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de metros quadrados da garagem ")));
		
		
	}

}
