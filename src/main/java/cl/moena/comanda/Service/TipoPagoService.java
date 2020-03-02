package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.TipoPago;

public interface TipoPagoService {

	TipoPago post(TipoPago objeto);

	List<TipoPago> get();

}
