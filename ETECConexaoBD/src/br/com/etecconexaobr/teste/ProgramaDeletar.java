package br.com.etecconexaobr.teste;

import java.sql.Connection;

import br.com.etecconexaobr.model.Pessoa;
import br.com.fabricacalcado.conexao.Conexao;
import br.com.etecconexaobr.dao.PessoaDAO;

public class ProgramaDeletar {
	
	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub
		
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);
		
		pessoa.setNome("Teste");
		pessoa.setEndereço("Rua do limoeiro");
		
		System.out.println(pessoadao.deletar(pessoa));
		
		Conexao.fecharConexao(con);
	}

}
