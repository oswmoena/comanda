package cl.moena.comanda.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@Entity
@Table (name = "orden_producto")
public class OrdenProducto {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_orden_producto", sequenceName = "sec_orden_producto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "orden_producto")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName = "id", insertable = true, updatable = true)
	private Producto idProducto;
	
	@ManyToOne
	@JoinColumn(name = "id_orden", referencedColumnName = "id", insertable = true, updatable = true)
	private Orden idOrden;
	
	@Column (name = "cantidad")
	private Integer cantidad;
	
	@Column (name = "vigencia")
	private Boolean vigencia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public Orden getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Orden idOrden) {
		this.idOrden = idOrden;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getVigencia() {
		return vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}
	
	
}
