package br.com.fabricaroupa.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;

public class SelecionarCalcaTeste {
	public static void main(String[] args) {

	// TODO Auto-generated method stub
	Connection con = Conexao.abrirConexao();
	CalcaDAO calcadao = new CalcaDAO(con);

	ArrayList<Calca> lista = calcadao.retornarDadosCalca();
	{

	if (lista != null) {
		for (Calca calca : lista) {
			System.out.println("Peso do calca: " + calca.getPeso());
			System.out.println("Tipo de tecido da calca: " + calca.getTipoTecido());
			System.out.println("Tipo de calca: " + calca.getTipo() +
			"\n"
					);;
			
		}
	}
	Conexao.fecharConexao(con);
}}}
