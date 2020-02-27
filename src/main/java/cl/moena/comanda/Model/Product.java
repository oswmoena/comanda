package cl.moena.comanda.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name="product")
public class Product {
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Id
	@SequenceGenerator(name = "sec_archivo", sequenceName = "gestion_planillas_musicales.sec_archivo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "archivo")
	private Long id;
	
	
}
