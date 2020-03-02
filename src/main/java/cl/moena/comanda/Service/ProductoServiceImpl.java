package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.Producto;
import cl.moena.comanda.Repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository productoRepository;
	
	@Override
	public Producto post(Producto objeto) {
		return productoRepository.save(objeto);
	}

	@Override
	public List<Producto> get() {
		return productoRepository.findAll();
	}

}
