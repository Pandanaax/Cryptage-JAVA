package fr.doranco.control;

import java.sql.SQLException;

import fr.doranco.entity.CartePaiement;

public interface ICartePaiement {

	CartePaiement addCartePaiement(CartePaiement cartePaiement) throws SQLException;
	CartePaiement getCartePaiementById(Integer id) throws SQLException;
	void updateCartePaiement(CartePaiement cartePaiement) throws SQLException;
	void removeCartePaiement(Integer id) throws SQLException;
	
}
