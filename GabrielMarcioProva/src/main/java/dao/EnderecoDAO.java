//GabrielMarcio
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Endereco;

public class EnderecoDAO {

	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public EnderecoDAO() {

	}

	public EnderecoDAO(Connection con) {
		setCon(con);
	}

	public String inserirEndereco(Endereco endereco) {
		String sql = "insert into endereco(cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getLogradouro());
			ps.setString(3, endereco.getComplemento());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getLocalidade());
			ps.setString(6, endereco.getUf());
			ps.setString(7, endereco.getIbge());
			ps.setString(8, endereco.getGia());
			ps.setString(9, endereco.getDdd());
			ps.setString(10, endereco.getSiafi());
			if (ps.executeUpdate() > 0) {
				return "Endereco inserido com sucesso";
			} else {
				return "Erro ao inserir endereco";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}

	}

	public String deletar(Endereco endereco) {
		String sql = "delete from endereco where cep = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, endereco.getCep());
			if (ps.executeUpdate() > 0) {
				return "Endereco deletado com sucesso.";
			} else {
				return "Erro ao deletar endereco.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterarLogradouroEndereco(Endereco endereco) {
		String sql = "update endereco set logradouro = (?) where cep = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, endereco.getLogradouro());
			ps.setString(2, endereco.getCep());
			if (ps.executeUpdate() > 0) {
				return "Endereco alterado com sucesso.";
			} else {
				return "Erro ao alterar endereco.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}

	}

	public ArrayList<Endereco> retornarDadosEndereco() {
		String sql = "select * from endereco";
		ArrayList<Endereco> retornarDadosEndereco = new ArrayList<Endereco>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Endereco endereco = new Endereco();
					endereco.setCep(rs.getString(1));
					endereco.setLogradouro(rs.getString(2));
					endereco.setComplemento(rs.getString(3));
					endereco.setBairro(rs.getString(4));
					endereco.setLocalidade(rs.getString(5));
					endereco.setUf(rs.getString(6));
					endereco.setIbge(rs.getString(7));
					endereco.setGia(rs.getString(8));
					endereco.setDdd(rs.getString(9));
					endereco.setSiafi(rs.getString(10));

					retornarDadosEndereco.add(endereco);
				}
				return retornarDadosEndereco;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<Endereco> retornarDadosEnderecoWhere(String cep) {
		String sql = "select * from endereco where cep = (cep)";
		ArrayList<Endereco> retornarDadosEndereco = new ArrayList<Endereco>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cep);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Endereco e = new Endereco();
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
					retornarDadosEndereco.add(e);
				}
				return retornarDadosEndereco;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
}