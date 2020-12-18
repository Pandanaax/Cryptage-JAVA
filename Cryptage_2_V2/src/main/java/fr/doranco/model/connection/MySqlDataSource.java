package fr.doranco.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySqlDataSource {

	private static MySqlDataSource instance;
	
	private MySqlDataSource() {
	}

	public static MySqlDataSource getInstance() {
		
		if (instance == null) {
			return new MySqlDataSource();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection connection = null;
		ResourceBundle rb = ResourceBundle.getBundle("fr.doranco.bdd.mysql.dbfile");
		String url = rb.getString("url");
		String login = rb.getString("login");
		String password = rb.getString("mdp");

		try {
			connection = DriverManager.getConnection(url, login, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}


}
