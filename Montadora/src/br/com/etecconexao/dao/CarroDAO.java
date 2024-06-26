package br.com.etecconexao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etecconexao.model.Carro;


public class CarroDAO {
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CarroDAO() {
		
	}
	
	public CarroDAO (Connection con) {
		setCon(con);
	}
	
	public String inserir (Carro carro) {
		String sql = "insert into carro(nome, endereco) values (?, ?)";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNome());
			ps.setString(2, carro.getEnderešo());
			if (ps.executeUpdate()> 0) {
				return "Inserido com sucesso";
			}
			else {
				return "Erro ao inserir";
			}
			
			}catch(SQLException e) {
				return e.getMessage();
			}

		
	}
	
	
	public String deletar(Carro carro) {
		String sql = "delete from carro where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNome());
			if (ps.executeUpdate() > 0 ){
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		}catch (SQLException e) {
			return e.getMessage();
		}
		

	}
	

}
	

