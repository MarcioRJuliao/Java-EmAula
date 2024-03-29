package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.ChineloDAO;
import br.com.fabricacalcado.model.Chinelo;


public class TesteDeletarChinelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub
		
		
		Chinelo chinelo = new Chinelo();
		ChineloDAO chinelodao = new ChineloDAO(con);
		
		chinelo.setNome("Havaianas");
		
		System.out.println(chinelodao.deletar(chinelo));
		
		Conexao.fecharConexao(con);
	}
	

}
