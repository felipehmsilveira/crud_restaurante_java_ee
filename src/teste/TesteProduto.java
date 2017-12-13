package teste;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basica.Produto;
import dados.DAOProduto;
import dao.DAOFactory;

public class TesteProduto {
	
	public static void main(String[] args) throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePSC");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		DAOProduto factoryProduto = DAOFactory.getDAOProduto();
		Produto c = new Produto();

		c.setDescricao("Descrição");
		c.setTipodoproduto("Tipo do produto");
		
		try{
			factoryProduto.insert(c);
			}catch (Exception ex){
				System.out.println(ex);
			}
	}
}
