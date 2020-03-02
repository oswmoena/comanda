package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.Tipo;

public interface TipoService {

	Tipo postTipo(Tipo tipo);

	List<Tipo> get();

}
