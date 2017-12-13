package dados;

import javax.persistence.EntityManagerFactory;

import basica.Produto;
import dao.DAOGenerico;

public class DAOProduto extends DAOGenerico<Produto> {

	public DAOProduto(EntityManagerFactory emf) {
		super(emf);
	}

}
