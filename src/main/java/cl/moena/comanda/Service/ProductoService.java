package cl.moena.comanda.Service;

import java.util.List;

import cl.moena.comanda.Model.Producto;

public interface ProductoService {

	Producto post(Producto objeto);

	List<Producto> get();

}
