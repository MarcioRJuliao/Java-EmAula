package br.com.horacio.teste;

import javax.swing.JOptionPane;

import br.com.horacio.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alunoUm = new Aluno();
		
		
		
		String recebeNome = JOptionPane.showInputDialog("Nome");
		String recebeCurso = JOptionPane.showInputDialog("Curso");
		int idadeRecebe = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
		
		alunoUm.setNome(recebeNome);
		alunoUm.setCursoAlocado(recebeCurso);
		alunoUm.setIdade(idadeRecebe);

		System.out.println("Aluno 1: \nO nome da aluna é " + alunoUm.getNome() +
				"\nO curso é " + alunoUm.getCursoAlocado()+
				"\nA idade da aluna é " + alunoUm.getIdade());
		
		//Other object
		
		Aluno alunoDois = new Aluno();
		
		alunoDois.setNome(JOptionPane.showInputDialog("Nome"));
		alunoDois.setCursoAlocado(JOptionPane.showInputDialog("Curso"));
		alunoDois.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite")));
		
		System.out.println("Aluno 2: \nO nome da aluna é " + alunoDois.getNome() +
				"\nO curso é " + alunoDois.getCursoAlocado()+
				"\nA idade da aluna é " + alunoDois.getIdade()
				);
				
		 
	}

}
