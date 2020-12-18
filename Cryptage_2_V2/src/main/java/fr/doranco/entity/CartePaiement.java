package fr.doranco.entity;

public class CartePaiement {

	private Integer id;
	private String numero;
	private String dateExpiration;
	private String cryptogramme;
	
	public CartePaiement() {
	}

	public CartePaiement(String numero, String dateExpiration, String cryptogramme) {
		this.numero = numero;
		this.dateExpiration = dateExpiration;
		this.cryptogramme = cryptogramme;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getCryptogramme() {
		return cryptogramme;
	}

	public void setCryptogramme(String cryptogramme) {
		this.cryptogramme = cryptogramme;
	}

	@Override
	public String toString() {
		return "CartePaiement [id=" + id + ", numero=" + numero + ", dateExpiration=" + dateExpiration
				+ ", cryptogramme=" + cryptogramme + "]";
	}
	
}
