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
@Table (name  = "estado")
public class Estado {
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_estado", sequenceName = "sec_estado", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "estado")
	private Integer id;
	
	@Column (name = "nombre")
	private String Nombre;
	
	@Column (name = "tipo")
	private String Tipo;
	
	@Column (name = "vigencia")
	private Boolean Vigencia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Boolean getVigencia() {
		return Vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		Vigencia = vigencia;
	}
	
	
}
