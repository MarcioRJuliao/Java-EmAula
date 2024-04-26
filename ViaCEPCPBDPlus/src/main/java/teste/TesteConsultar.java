package teste;

import java.sql.Connection;
import java.util.ArrayList;

import conexao.Conexao;
import dao.EnderecoDAO;
import dao.PessoaDAO;
import model.Endereco;
import model.Pessoa;

public class TesteConsultar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		EnderecoDAO enderecodao = new EnderecoDAO(con);
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);

		ArrayList<Endereco> lista = enderecodao.retornarDadosEndereco();

		if (lista != null) {
			for (Endereco endereco : lista) {
				
				System.out.println("\n");
				System.out.println("CPF: " + pessoa.getCpf());
				System.out.println("CEP: " + endereco.getCep());
				System.out.println("Logradouro: " + endereco.getLogradouro());
				System.out.println("Complemento: " + endereco.getComplemento());
				System.out.println("Bairro: " + endereco.getBairro());
				System.out.println("Localidade: " + endereco.getLocalidade());
				System.out.println("UF: " + endereco.getUf());
				System.out.println("IBGE: " + endereco.getIbge());
				System.out.println("Gia: " + endereco.getGia());
				System.out.println("DDD: " + endereco.getDdd());
				System.out.println("Siafi: " + endereco.getSiafi()
				+
				"\n"
						);;
				
			}
		}
		Conexao.fecharConexao(con);

	}

}
