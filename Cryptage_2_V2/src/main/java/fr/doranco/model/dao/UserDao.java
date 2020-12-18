package fr.doranco.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.doranco.entity.UserDojo;
import fr.doranco.model.connection.MySqlDataSource;

public class UserDao implements IUserDao {

	@Override
	public UserDojo addUser(UserDojo userDojo) throws SQLException {

		Connection connection = MySqlDataSource.getInstance().getConnection();
	
		String requete = "INSERT INTO utilisateur(nom, prenom, email, login, password, crypt_key) VALUES(?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, userDojo.getNom());
		ps.setString(2, userDojo.getPrenom());
		ps.setString(3, userDojo.getEmail());
		ps.setString(4, userDojo.getLogin());
		ps.setBytes(5, userDojo.getPassword());
		ps.setBytes(6, userDojo.getCleCryptage());
		
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			userDojo.setId(rs.getInt(1));
		}
		
		return userDojo;
	}

	@Override
	public UserDojo getUserById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDojo getUserByLogin(String login) throws SQLException {

		Connection connection = MySqlDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM utilisateur WHERE login = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setString(1, login);
		
		ResultSet rs = ps.executeQuery();
		UserDojo userDojo = null;
		if (rs.next()) {
			userDojo = new UserDojo();
			userDojo.setId(rs.getInt(1));
			userDojo.setNom(rs.getString(2));
			userDojo.setPrenom(rs.getString(3));
			userDojo.setEmail(rs.getString(4));
			userDojo.setLogin(rs.getString(5));
			userDojo.setPassword(rs.getBytes(6));
			userDojo.setCleCryptage(rs.getBytes(7));
		}
		return userDojo;
	}

	@Override
	public UserDojo getUserByEmail(String email) throws SQLException {

		Connection connection = MySqlDataSource.getInstance().getConnection();
		
		String requete = "SELECT * FROM utilisateur WHERE email = ?";
		PreparedStatement ps = connection.prepareStatement(requete);
		ps.setString(1, email);
		
		ResultSet rs = ps.executeQuery();
		UserDojo userDojo = null;
		if (rs.next()) {
			userDojo = new UserDojo();
			userDojo.setId(rs.getInt(1));
			userDojo.setNom(rs.getString(2));
			userDojo.setPrenom(rs.getString(3));
			userDojo.setEmail(rs.getString(4));
			userDojo.setLogin(rs.getString(5));
			userDojo.setPassword(rs.getBytes(6));
			userDojo.setCleCryptage(rs.getBytes(7));
		}
		return userDojo;
	}

	@Override
	public void updateUser(UserDojo userDojo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(Integer id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean seConnecter(String login, String password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
