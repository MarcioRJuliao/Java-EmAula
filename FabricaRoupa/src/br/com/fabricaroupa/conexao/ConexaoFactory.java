package br.com.fabricaroupa.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args) throws SQLException {
		
	Connection conexao = null;
	String url = "jdbc:mysql://localhost:3307/ronqui";
	conexao = DriverManager.getConnection(url, "root", "*123456HAS*" );
	System.out.println("Abriu a conex�o.");
	conexao.close();

	}

}
