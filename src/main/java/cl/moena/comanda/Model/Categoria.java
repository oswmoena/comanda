package cl.moena.comanda.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table (name= "categoria")
public class Categoria {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_categoria", sequenceName = "sec_categoria", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "categoria")
	private Integer id;
	
	@Column (name = "nombre", length = 200)
	private String nombre;
	
	@Column (name = "vigencia")
	private Boolean vigencia;

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

	public Boolean getVigencia() {
		return vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}
}
