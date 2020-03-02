package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.OrdenProducto;
import cl.moena.comanda.Repository.OrdenProductoRepository;

@Service
public class OrdenProductoServiceImpl implements OrdenProductoService{

	@Autowired
	OrdenProductoRepository ordenProductoRepository;
	
	@Override
	public OrdenProducto post(OrdenProducto objeto) {
		return ordenProductoRepository.save(objeto);
	}

	@Override
	public List<OrdenProducto> get() {
		return ordenProductoRepository.findAll();
	}

}
