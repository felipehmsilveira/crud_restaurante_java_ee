package teste;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basica.Cliente;
import dados.DAOCliente;
import dao.DAOFactory;

public class TesteCliente {
	
	public static void main(String[] args) throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePSC");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		DAOCliente factoryCliente = DAOFactory.getDAOCliente();
		Cliente c = new Cliente();
		
		c.setDatadenascimento("01/06/94");
		c.setNome("Aterivaldo");
		c.setPaginanofacebook("www.facebook.com/Aterivaldo");
		c.setUsuariodotwitter("Aterivaldozinho");
		
		try{
			factoryCliente.insert(c);
			}catch (Exception ex){
				System.out.println(ex);
			}
	}
}
