import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

import javax.crypto.NoSuchPaddingException;

import fr.doranco.control.IUser;
import fr.doranco.control.UserImpl;
import fr.doranco.entity.User;

public class Main {

	public static void main(String[] args) {
		
		IUser userImpl = new UserImpl();
		
		User user = new User();
		user.setNom("BERT");
		user.setPrenom("Paul");
		user.setLogin("paulbert");
		user.setEmail("paulbert@gmail.com");
		user.setPassword("Doranco123%�");

		try {
			User addedUser = userImpl.addUser(user);
			if (addedUser == null) {
				System.out.println("Le login et/ou email choisi (s) existe (ent) d�j�, veuillez choisir un autre login/email.");
			} else {
				System.out.println("Utilisateur cr�e avec succ�s.");
				System.out.println(addedUser);
			}
			
		} catch (UnsupportedEncodingException | SQLException | GeneralSecurityException e) {
			e.printStackTrace();
		}
		
//		try {
//			User user1 = userImpl.getUserByLogin("paul-bert");
//			System.out.println(user1);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NoSuchPaddingException e) {
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (GeneralSecurityException e) {
//			e.printStackTrace();
//		}
				
	}
}
