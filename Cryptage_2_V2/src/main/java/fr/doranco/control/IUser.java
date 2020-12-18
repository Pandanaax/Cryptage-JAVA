package fr.doranco.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.entity.User;

public interface IUser {

	User addUser(User user) throws SQLException, NoSuchAlgorithmException, GeneralSecurityException, UnsupportedEncodingException;
	User getUserById(Integer id) throws SQLException;
	User getUserByLogin(String login) throws SQLException, GeneralSecurityException, NoSuchPaddingException,
												UnsupportedEncodingException, GeneralSecurityException;
	void updateUser(User user) throws SQLException;
	void removeUser(Integer id) throws SQLException;
	boolean seConnecter(String login, String password) throws SQLException;
	

}
