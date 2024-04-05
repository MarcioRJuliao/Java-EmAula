package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;

public class InserirCalcaTeste {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);

		calca.setPeso(20);
		calca.setTipoTecido("jeans");
		calca.setTipo("casual");

		System.out.println(calcadao.inserirCalca(calca));

		Conexao.fecharConexao(con);


	}

}
