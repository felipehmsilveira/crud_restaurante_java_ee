package teste;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import basica.Funcionario;
import dados.DAOFuncionario;
import dao.DAOFactory;

public class TesteFuncionario {
	
	public static void main(String[] args) throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePSC");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		DAOFuncionario factoryFuncionario = DAOFactory.getDAOFuncionario();
		Funcionario c = new Funcionario();
		
		c.setBairro("Ipsep");
		c.setCidade("Recife");
		c.setCpf("0202038947");
		c.setDatadenascimento("01/06/94");
		c.setEmail("ateriovaldo@gmail.com");
		c.setEstado("PE");
		c.setLogradouro("APT");
		c.setNome("Ateriovaldo");
		c.setSalario("1999.99");
		
		try{
			factoryFuncionario.insert(c);
			}catch (Exception ex){
				System.out.println(ex);
			}
		
	}
	
}
