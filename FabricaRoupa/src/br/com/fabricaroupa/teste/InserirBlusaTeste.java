package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.BlusaDAO;
import br.com.fabricaroupa.model.Blusa;

public class InserirBlusaTeste {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		// TODO Auto-generated method stub

		Blusa blusa = new Blusa();
		BlusaDAO blusadao = new BlusaDAO(con);

		blusa.setPeso(35);
		blusa.setTipoTecido("moletom");
		blusa.setTouca(1);

		System.out.println(blusadao.inserirBlusa(blusa));

		Conexao.fecharConexao(con);


	}

}
