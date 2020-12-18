package fr.doranco.model.dao;

import java.sql.SQLException;

import fr.doranco.entity.UserDojo;

public interface IUserDao {

	UserDojo addUser(UserDojo userDojo) throws SQLException;
	UserDojo getUserById(Integer id) throws SQLException;
	UserDojo getUserByLogin(String login) throws SQLException;
	UserDojo getUserByEmail(String email) throws SQLException;
	void updateUser(UserDojo userDojo) throws SQLException;
	void removeUser(Integer id) throws SQLException;
	boolean seConnecter(String login, String password) throws SQLException;
	

}
