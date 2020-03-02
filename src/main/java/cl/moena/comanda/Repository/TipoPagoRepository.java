package cl.moena.comanda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import cl.moena.comanda.Model.TipoPago;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago, Integer>, JpaSpecificationExecutor<TipoPago>{

}
