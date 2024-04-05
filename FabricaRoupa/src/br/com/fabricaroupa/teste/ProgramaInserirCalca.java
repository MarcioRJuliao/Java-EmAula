package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;

public class ProgramaInserirCalca {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);
		
		calca.setPeso(500);
		calca.setTipoTecido("Sarja");
		calca.setTipo("Servi�o");

	
		calcadao.inserirCalca(calca);
		Conexao.fecharConexao(con);
	}
}
