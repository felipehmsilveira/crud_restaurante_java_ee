package dao;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dados.DAOCliente;
import dados.DAOFuncionario;
import dados.DAOPedido;
import dados.DAOProduto;


public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("testePSC");		
	}
	
	public static DAOCliente getDAOCliente(){
		DAOCliente dao =  new DAOCliente(factory);
		return dao;
	}
	public static DAOFuncionario getDAOFuncionario(){
		DAOFuncionario dao =  new DAOFuncionario(factory);
		return dao;
	}
	public static DAOPedido getDAOPedido(){
		DAOPedido dao =  new DAOPedido(factory);
		return dao;
	}
	public static DAOProduto getDAOProduto(){
		DAOProduto dao =  new DAOProduto(factory);
		return dao;
	}
}
