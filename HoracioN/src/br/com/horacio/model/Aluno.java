package br.com.horacio.model;

public class Aluno extends Pessoa {
	
	private String cursoAlocado;

	private int idade;

	public String getCursoAlocado() {
		return cursoAlocado;
	}

	public void setCursoAlocado(String cursoAlocado) {
		this.cursoAlocado = cursoAlocado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
