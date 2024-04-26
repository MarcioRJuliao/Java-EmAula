// GabrielMarcio

package br.com.GabrielMarcioDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.GabrielMarcioModel.*;


public class GabrielMarcioProfessorDAO {
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public GabrielMarcioProfessorDAO() {

	}

	public GabrielMarcioProfessorDAO(Connection con) {
		setCon(con);
	}

	public String inserirGabrielMarcioProfessorModel(GabrielMarcioProfessorModel professor) {
		String sql = "insert into pessoa(nome, salario, sexo, idade, cep, rua, materias) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, professor.getNome());
			ps.setDouble(2, professor.getSalario());
			ps.setString(3, professor.getSexo());
			ps.setInt(4, professor.getIdade());
			ps.setString(5, professor.getCep());
			ps.setString(6, professor.getRua());
			ps.setString(7, professor.getMateria());
			if (ps.executeUpdate() > 0) {
				return "GabrielMarcioProfessorModel inserido com sucesso";
			} else {
				return "Erro ao inserir professor";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}

	}

	public String deletar(GabrielMarcioProfessorModel professor) {
		String sql = "delete from professor where cep = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, professor.getCep());
			if (ps.executeUpdate() > 0) {
				return "GabrielMarcioProfessorModel deletado com sucesso.";
			} else {
				return "Erro ao deletar professor.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterarLogradouroGabrielMarcioProfessorModel(GabrielMarcioProfessorModel professor) {
		String sql = "update professor set logradouro = (?) where cep = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, professor.getLogradouro());
			ps.setString(2, professor.getCep());
			if (ps.executeUpdate() > 0) {
				return "GabrielMarcioProfessorModel alterado com sucesso.";
			} else {
				return "Erro ao alterar professor.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}

	}

	public ArrayList<GabrielMarcioProfessorModel> retornarDadosGabrielMarcioProfessorModel() {
		String sql = "select * from professor";
		ArrayList<GabrielMarcioProfessorModel> retornarDadosGabrielMarcioProfessorModel = new ArrayList<GabrielMarcioProfessorModel>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					GabrielMarcioProfessorModel professor = new GabrielMarcioProfessorModel();
					professor.setCep(rs.getString(1));
					professor.setLogradouro(rs.getString(2));
					professor.setComplemento(rs.getString(3));
					professor.setBairro(rs.getString(4));
					professor.setLocalidade(rs.getString(5));
					professor.setUf(rs.getString(6));
					professor.setIbge(rs.getString(7));
					professor.setGia(rs.getString(8));
					professor.setDdd(rs.getString(9));
					professor.setSiafi(rs.getString(10));

					retornarDadosGabrielMarcioProfessorModel.add(professor);
				}
				return retornarDadosGabrielMarcioProfessorModel;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<GabrielMarcioProfessorModel> retornarDadosGabrielMarcioProfessorModelWhere(String cep) {
		String sql = "select * from professor where cep = (cep)";
		ArrayList<GabrielMarcioProfessorModel> retornarDadosGabrielMarcioProfessorModel = new ArrayList<GabrielMarcioProfessorModel>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cep);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					GabrielMarcioProfessorModel e = new GabrielMarcioProfessorModel();
					e.setCep(rs.getString(1));
					e.setLogradouro(rs.getString(2));
					e.setComplemento(rs.getString(3));
					e.setBairro(rs.getString(4));
					e.setLocalidade(rs.getString(5));
					e.setUf(rs.getString(6));
					e.setIbge(rs.getString(7));
					e.setGia(rs.getString(8));
					e.setDdd(rs.getString(9));
					e.setSiafi(rs.getString(10));
					retornarDadosGabrielMarcioProfessorModel.add(e);
				}
				return retornarDadosGabrielMarcioProfessorModel;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
}
