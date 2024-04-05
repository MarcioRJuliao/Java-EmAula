package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;



public class DeletarCalcaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub
		
		
		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);
		
		calca.setPeso(20);
		
		System.out.println(calcadao.deletar(calca));
		
		Conexao.fecharConexao(con);
	}
	
}
