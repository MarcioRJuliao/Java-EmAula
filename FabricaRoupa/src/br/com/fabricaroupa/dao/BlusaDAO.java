package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricaroupa.model.Blusa;
import br.com.fabricaroupa.model.Blusa;

public class BlusaDAO {


	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public BlusaDAO() {

	}

	public BlusaDAO(Connection con) {
		setCon(con);
	}

	public String inserirBlusa(Blusa blusa) {
		String sql = "insert into blusa(peso, tipoTecido, touca) values (?, ?, ?)";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, blusa.getPeso());
			ps.setString(2, blusa.getTipoTecido());
			ps.setInt(3, blusa.getTouca());
			if (ps.executeUpdate() > 0) {
				return "Blusa inserido com sucesso";
			} else {
				return "Erro ao inserir blusa";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}
}
	
	public String deletar(Blusa blusa) {
		String sql = "delete from blusa where peso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, blusa.getPeso());
			if (ps.executeUpdate() > 0) {
				return "Blusa deletada com sucesso.";
			} else {
				return "Erro ao deletar blusa.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

