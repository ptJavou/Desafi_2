package DAO;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entities.Cliente;

public class ClienteDAO {

	EntityManager em = JPAUtil.getEntityManager();
	
	public Cliente buscarCliente(String cpf){
		Query q = em.createQuery("SELECT c FROM Cliente c WHERE c.cpf = '" + cpf + "'");
		Cliente cliente = (Cliente) q.getSingleResult();
		return cliente;
	}
}
