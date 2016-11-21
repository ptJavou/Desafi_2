package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.sql.ordering.antlr.Factory;

public class JPAUtil {

	private static EntityManagerFactory factory;
	
		
	static{
		factory = Persistence.createEntityManagerFactory("Desafio2PU");
	}
	
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	
	public static void close(){
		factory.close();
	}
}
