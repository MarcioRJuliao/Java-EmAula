package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.ChineloDAO;
import br.com.fabricacalcado.model.Chinelo;

public class TesteAtualizarChinelo {
	
	public static void main(String[] args) {
	Connection con = Conexao.abrirConexao();
	// TODO Auto-generated method stub
	
	
	Chinelo chinelo = new Chinelo();
	ChineloDAO chinelodao = new ChineloDAO(con);
	
	chinelo.setNome("Havaianas");
	chinelo.setTamanho(50);
	
	System.out.println(chinelodao.alterarTamanhoChinelo(chinelo));
	
	Conexao.fecharConexao(con);
}
}