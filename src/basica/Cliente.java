package basica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String datadenascimento;
	private String paginanofacebook;
	private String usuariodotwitter;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getPaginanofacebook() {
		return paginanofacebook;
	}
	public void setPaginanofacebook(String paginanofacebook) {
		this.paginanofacebook = paginanofacebook;
	}
	public String getUsuariodotwitter() {
		return usuariodotwitter;
	}
	public void setUsuariodotwitter(String usuariodotwitter) {
		this.usuariodotwitter = usuariodotwitter;
	}
}
