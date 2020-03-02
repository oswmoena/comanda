package cl.moena.comanda.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name="producto")
public class Producto {
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_producto", sequenceName = "sec_producto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "producto")
	private Integer id;
	
	@Column (name = "nombre", length = 200)
	private String nombre;
	
	@Column (name = "precio")
	private Integer precio;
	
	@Column (name = "detalle", columnDefinition = "text")
	private String detalle;
	
	@Column (name= "vigencia")
	private Boolean vigencia;
	
	@OneToOne(targetEntity = Tipo.class )
	@JoinColumn(name = "id_tipo", referencedColumnName = "id", insertable = true, updatable = true)
	private Tipo idTipo;

	@OneToOne(targetEntity = Estado.class )
	@JoinColumn(name = "id_estado", referencedColumnName = "id", insertable = true, updatable = true)
	private Estado idEstado;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Boolean getVigencia() {
		return vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}

	public Tipo getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Tipo idTipo) {
		this.idTipo = idTipo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}
	
	
}
