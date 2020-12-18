package fr.doranco.entity.utils;

import fr.doranco.entity.User;
import fr.doranco.entity.UserDojo;

public abstract class Conversion {

	public static UserDojo convertUserToDojo(User user) {
		
		UserDojo userDojo = new UserDojo();
		
		// remplissage de l'objet userDojo à partir de l'objet user
		
		return userDojo;
	}

	public static User convertUserToPojo(UserDojo userDojo) {
		
		User user = new User();
		
		// remplissage de l'objet user à partir de l'objet userDojo
		
		return user;
	}
}
