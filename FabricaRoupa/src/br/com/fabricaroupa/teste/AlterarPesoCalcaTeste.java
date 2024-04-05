package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;



public class AlterarPesoCalcaTeste {

	
	public static void main(String[] args) {
	Connection con = Conexao.abrirConexao();
	// TODO Auto-generated method stub
	
	
	Calca calca = new Calca();
	CalcaDAO calcadao = new CalcaDAO(con);
	

	calca.setTipo("casual");	
	calca.setPeso(50);
	
	
	System.out.println(calcadao.alterarPesoCalca(calca));
	
	Conexao.fecharConexao(con);

	}
	
	
}
