package fr.doranco.control;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;
import com.sun.org.apache.xpath.internal.FoundIndex;

import fr.doranco.cryptage.GenerateKey;
import fr.doranco.cryptage.algo.CryptageDES;
import fr.doranco.entity.User;
import fr.doranco.entity.UserDojo;
import fr.doranco.model.dao.IUserDao;
import fr.doranco.model.dao.UserDao;
import fr.doranco.utils.AlgorithmeCryptage;

public class UserImpl implements IUser {

	IUserDao userDao = new UserDao();

	@Override
	public User addUser(User user)
			throws SQLException, NoSuchAlgorithmException, GeneralSecurityException, UnsupportedEncodingException {

		if (user == null) {
			throw new NullPointerException("l'utilisateur à ajouter ne doit pas être NULL !");
		}

		if (user.getNom() == null || user.getNom().isEmpty() || user.getPrenom() == null || user.getPrenom().isEmpty()
				|| user.getEmail() == null || user.getEmail().isEmpty() || user.getLogin() == null
				|| user.getLogin().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()) {

			throw new IllegalArgumentException(
					"Les paramètres de l'utilisateur à ajouter ne doivent pas être nuls ou vides !");
		}

		UserDojo uDojo = userDao.getUserByLogin(user.getLogin());
		if (uDojo != null) {
			return null;
		}

		uDojo = userDao.getUserByEmail(user.getEmail());
		if (uDojo != null) {
			return null;
		}

		UserDojo userDojo = new UserDojo();
		userDojo.setNom(user.getNom());
		userDojo.setPrenom(user.getPrenom());
		userDojo.setEmail(user.getEmail());
		userDojo.setLogin(user.getLogin());

		SecretKey key = GenerateKey.getKey(AlgorithmeCryptage.DES.toString(), 56);
		byte[] passwordCrypte = CryptageDES.encrypt(user.getPassword(), key);

		userDojo.setCleCryptage(key.getEncoded());
		userDojo.setPassword(passwordCrypte);

		UserDojo userDojoAdded = userDao.addUser(userDojo);

		if (userDojoAdded == null) {
			return null;
		}
		user.setId(userDojoAdded.getId());

		return user;
	}

	@Override
	public User getUserById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLogin(String login) throws SQLException, GeneralSecurityException, NoSuchPaddingException,
														UnsupportedEncodingException, GeneralSecurityException {

		UserDojo userDojo = userDao.getUserByLogin(login);

		User user = new User();
		user.setId(userDojo.getId());
		user.setNom(userDojo.getNom());
		user.setPrenom(userDojo.getPrenom());
		user.setEmail(userDojo.getEmail());
		user.setLogin(userDojo.getLogin());

		byte[] passwordCrypte = userDojo.getPassword();
		byte[] cleCryptage = userDojo.getCleCryptage();
		SecretKey key = new SecretKeySpec(cleCryptage, 0, cleCryptage.length, "DES");
		String password = CryptageDES.decrypt(passwordCrypte, key);
		
		user.setPassword(password);
		
		return user;
	}

	@Override
	public void updateUser(User user) throws SQLException {
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
