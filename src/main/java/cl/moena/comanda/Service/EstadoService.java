package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.Estado;

public interface EstadoService {

	Estado post(Estado objeto);

	List<Estado> get();

}
