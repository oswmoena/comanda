package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.OrdenProducto;

public interface OrdenProductoService {

	OrdenProducto post(OrdenProducto objeto);

	List<OrdenProducto> get();

}
