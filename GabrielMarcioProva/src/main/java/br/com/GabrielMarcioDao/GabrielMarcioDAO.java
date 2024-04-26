//GabrielMarcio

package br.com.GabrielMarcioDao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

	import br.com.GabrielMarcioModel.*;

	public class GabrielMarcioDAO {

		private Connection con;

		public Connection getCon() {
			return con;
		}

		public void setCon(Connection con) {
			this.con = con;
		}

		public GabrielMarcioDAO() {

		}

		public GabrielMarcioDAO(Connection con) {
			setCon(con);
		}

		public String inserirProfessor(Professor professor) {
			String sql = "insert into professor(cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, professor.getCep());
				ps.setString(2, professor.getLogradouro());
				ps.setString(3, professor.getComplemento());
				ps.setString(4, professor.getBairro());
				ps.setString(5, professor.getLocalidade());
				ps.setString(6, professor.getUf());
				ps.setString(7, professor.getIbge());
				ps.setString(8, professor.getGia());
				ps.setString(9, professor.getDdd());
				ps.setString(10, professor.getSiafi());
				if (ps.executeUpdate() > 0) {
					return "Professor inserido com sucesso";
				} else {
					return "Erro ao inserir professor";
				}

			} catch (SQLException e) {
				return e.getMessage();
			}

		}

		public String deletar(Professor professor) {
			String sql = "delete from professor where cep = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, professor.getCep());
				if (ps.executeUpdate() > 0) {
					return "Professor deletado com sucesso.";
				} else {
					return "Erro ao deletar professor.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		public String alterarLogradouroProfessor(Professor professor) {
			String sql = "update professor set logradouro = (?) where cep = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, professor.getLogradouro());
				ps.setString(2, professor.getCep());
				if (ps.executeUpdate() > 0) {
					return "Professor alterado com sucesso.";
				} else {
					return "Erro ao alterar professor.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}

		}

		public ArrayList<Professor> retornarDadosProfessor() {
			String sql = "select * from professor";
			ArrayList<Professor> retornarDadosProfessor = new ArrayList<Professor>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Professor professor = new Professor();
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

						retornarDadosProfessor.add(professor);
					}
					return retornarDadosProfessor;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}
		}

		public ArrayList<Professor> retornarDadosProfessorWhere(String cep) {
			String sql = "select * from professor where cep = (cep)";
			ArrayList<Professor> retornarDadosProfessor = new ArrayList<Professor>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, cep);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Professor e = new Professor();
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
						retornarDadosProfessor.add(e);
					}
					return retornarDadosProfessor;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}
		}
	}
}
