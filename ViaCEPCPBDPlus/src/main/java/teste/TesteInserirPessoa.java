package teste;

import java.io.IOException;
import java.sql.Connection;

import javax.swing.JOptionPane;

import conexao.Conexao;
import dao.EnderecoDAO;
import dao.PessoaDAO;
import model.Endereco;
import model.Pessoa;
import service.ViacepService;

public class TesteInserirPessoa {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);

		pessoa.setCpf(Long.parseLong(JOptionPane.showInputDialog("Insira o CPF da pessoa")));
		pessoa.setNome(JOptionPane.showInputDialog("Insira o nome da pessoa"));
		pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da pessoa")));

		System.out.println(pessoadao.inserir(pessoa));

		Conexao.fecharConexao(con);
		
		
	}
}