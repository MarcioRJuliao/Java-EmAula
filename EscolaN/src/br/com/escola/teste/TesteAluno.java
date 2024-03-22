package br.com.escola.teste;

import br.com.escola.beans.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		
		aluno.setNome("Nathalli");
		aluno.setIdade(25);
		aluno.setRm("231519");
		aluno.setCursoAlocado("DS");
		
		System.out.println("O nome da aluna é " + aluno.getNome() +
				"\n A idade da aluna é " + aluno.getIdade() +
				"\n O RM da aluna é " + aluno.getRm() +
				"\n O Curso Alocado da aluna é " + aluno.getCursoAlocado()
				
				); 
		
	}

}
