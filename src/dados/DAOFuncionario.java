package dados;

import javax.persistence.EntityManagerFactory;

import basica.Funcionario;
import dao.DAOGenerico;

public class DAOFuncionario extends DAOGenerico<Funcionario> {

	public DAOFuncionario(EntityManagerFactory emf) {
		super(emf);
	}

}
