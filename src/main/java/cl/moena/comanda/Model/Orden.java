package cl.moena.comanda.Model;

import java.time.LocalDateTime;

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
@Table (name = "orden")
public class Orden {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_orden", sequenceName = "sec_orden", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "orden")
	private Integer id;
	
	@Column (name = "fecha")
	private LocalDateTime fecha;
	
	@Column (name = "vigencia")
	private Boolean vigencia;
	
	@OneToOne(targetEntity = TipoPago.class )
	@JoinColumn(name = "id_tipo_pago", referencedColumnName = "id", insertable = true, updatable = true)
	private TipoPago idTipoPago;
	
	@OneToOne(targetEntity = Estado.class )
	@JoinColumn(name = "id_estado", referencedColumnName = "id", insertable = true, updatable = true)
	private Estado idEstado;
	
	@OneToOne(targetEntity = OrdenProducto.class )
	@JoinColumn(name = "id_orden_producto", referencedColumnName = "id", insertable = true, updatable = true)
	private OrdenProducto idOrdenProducto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Boolean getVigencia() {
		return vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}

	public TipoPago getIdTipoPago() {
		return idTipoPago;
	}

	public void setIdTipoPago(TipoPago idTipoPago) {
		this.idTipoPago = idTipoPago;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}

	public OrdenProducto getIdOrdenProducto() {
		return idOrdenProducto;
	}

	public void setIdOrdenProducto(OrdenProducto idOrdenProducto) {
		this.idOrdenProducto = idOrdenProducto;
	}
	
	
}
