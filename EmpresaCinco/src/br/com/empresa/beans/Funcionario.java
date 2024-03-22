package br.com.empresa.beans;

public class Funcionario extends Condominio{
	
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void mostrarAtributo() {
		System.out.println("Nome: " + getNome() +
				"\nSexo: " + getSexo() +
				"\nIdade: " + getIdade() +
				"\nCargo: " + getCargo());

	}
}
