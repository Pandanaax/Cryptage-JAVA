package fr.doranco.entity;

import java.util.Arrays;

public class CartePaiementDojo {

	private Integer id;
	private byte[] numero;
	private String dateExpiration;
	private byte[] cryptogramme;
	
	public CartePaiementDojo() {
	}

	public CartePaiementDojo(byte[] numero, String dateExpiration, byte[] cryptogramme) {
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

	public byte[] getNumero() {
		return numero;
	}

	public void setNumero(byte[] numero) {
		this.numero = numero;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public byte[] getCryptogramme() {
		return cryptogramme;
	}

	public void setCryptogramme(byte[] cryptogramme) {
		this.cryptogramme = cryptogramme;
	}

	@Override
	public String toString() {
		return "CartePaiementDojo [id=" + id + ", numero=" + Arrays.toString(numero) + ", dateExpiration="
				+ dateExpiration + ", cryptogramme=" + Arrays.toString(cryptogramme) + "]";
	}
	
}
