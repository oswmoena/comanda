package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.Orden;

public interface OrdenService {

	Orden post(Orden objeto);

	List<Orden> get();

}
