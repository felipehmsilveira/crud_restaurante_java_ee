package basica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	private String tipodoproduto;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipodoproduto() {
		return tipodoproduto;
	}
	public void setTipodoproduto(String tipodoproduto) {
		this.tipodoproduto = tipodoproduto;
	}
}
