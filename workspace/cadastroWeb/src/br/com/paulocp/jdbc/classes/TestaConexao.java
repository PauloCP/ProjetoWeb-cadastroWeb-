package br.com.paulocp.jdbc.classes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.paulocp.jdbc.*;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
		connection.close();

	}

}
