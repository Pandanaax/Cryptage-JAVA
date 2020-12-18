package fr.doranco.entity;

import java.util.Arrays;

public class UserDojo {

	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private byte[] password;
	private byte[] cleCryptage;
	private CartePaiement cartePaiement;
	
	public UserDojo() {
	}

	public UserDojo(String nom, String prenom, String email, String login, byte[] password, byte[] cleCryptage,
			CartePaiement cartePaiement) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.cleCryptage = cleCryptage;
		this.cartePaiement = cartePaiement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public byte[] getCleCryptage() {
		return cleCryptage;
	}

	public void setCleCryptage(byte[] cleCryptage) {
		this.cleCryptage = cleCryptage;
	}

	public CartePaiement getCartePaiement() {
		return cartePaiement;
	}

	public void setCartePaiement(CartePaiement cartePaiement) {
		this.cartePaiement = cartePaiement;
	}

	@Override
	public String toString() {
		return "UserDojo [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login
				+ ", password=" + Arrays.toString(password) + ", cleCryptage=" + Arrays.toString(cleCryptage)
				+ ", cartePaiement=" + cartePaiement + "]";
	}

}
