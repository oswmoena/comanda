package cl.moena.comanda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import cl.moena.comanda.Model.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Integer>, JpaSpecificationExecutor<Orden>{

	
}
