package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.ChineloDAO;
import br.com.fabricacalcado.model.Chinelo;

public class TesteInserirChinelo {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub

		Chinelo chinelo = new Chinelo();
		ChineloDAO chinelodao = new ChineloDAO(con);

		chinelo.setTamanho(42);
		chinelo.setPeso(200);
		chinelo.setNome("Havaianas");
		chinelo.setQuantidadeTiras(2);

		System.out.println(chinelodao.inserirChinelo(chinelo));

		Conexao.fecharConexao(con);
		

	}

}
