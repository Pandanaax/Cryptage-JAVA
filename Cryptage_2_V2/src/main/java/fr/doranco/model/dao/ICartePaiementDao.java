package fr.doranco.model.dao;

import java.sql.SQLException;

import fr.doranco.entity.CartePaiementDojo;

public interface ICartePaiementDao {

	CartePaiementDojo addCartePaiement(CartePaiementDojo cartePaiementDojo) throws SQLException;
	CartePaiementDojo getCartePaiementById(Integer id) throws SQLException;
	void updateCartePaiement(CartePaiementDojo cartePaiementDojo) throws SQLException;
	void removeCartePaiement(Integer id) throws SQLException;
	
}
