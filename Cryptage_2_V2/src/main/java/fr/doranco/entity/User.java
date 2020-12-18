package fr.doranco.entity;

public class User {

	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private CartePaiement cartePaiement;
	
	public User() {
	}

	public User(String nom, String prenom, String email, String login, String password, CartePaiement cartePaiement) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CartePaiement getCartePaiement() {
		return cartePaiement;
	}

	public void setCartePaiement(CartePaiement cartePaiement) {
		this.cartePaiement = cartePaiement;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login
				+ ", password=" + password + ", cartePaiement=" + cartePaiement + "]";
	}
	
}
