package teste;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basica.Pedido;
import dados.DAOPedido;
import dao.DAOFactory;

public class TestePedido {
	
	public static void main(String[] args) throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePSC");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		DAOPedido factoryPedido = DAOFactory.getDAOPedido();
		Pedido c = new Pedido();

		c.setFechamentodopedido("string aleatoria");
		c.setIniciodopedido("string aleatoria");
		
		try{
			factoryPedido.insert(c);
			}catch (Exception ex){
				System.out.println(ex);
			}
	}
}
