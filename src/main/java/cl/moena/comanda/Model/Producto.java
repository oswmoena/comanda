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
	
	@Column (name= "vigencia")
	private Boolean vigencia;
	
	@OneToOne(targetEntity = Categoria.class )
	@JoinColumn(name = "id_categoria", referencedColumnName = "id", insertable = true, updatable = true)
	private Categoria idCategoria;

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

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
