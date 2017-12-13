package basica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private Integer id;
	private String iniciodopedido;
	private String fechamentodopedido;
	
	public String getIniciodopedido() {
		return iniciodopedido;
	}
	public void setIniciodopedido(String iniciodopedido) {
		this.iniciodopedido = iniciodopedido;
	}
	public String getFechamentodopedido() {
		return fechamentodopedido;
	}
	public void setFechamentodopedido(String fechamentodopedido) {
		this.fechamentodopedido = fechamentodopedido;
	}
}
